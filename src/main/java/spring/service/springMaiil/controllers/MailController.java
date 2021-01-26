package spring.service.springMaiil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import spring.service.springMaiil.config.AppConfig;
import spring.service.springMaiil.pojos.MailModel;
import spring.service.springMaiil.pojos.ResponsePayload;
import spring.service.springMaiil.services.MailService;
import spring.service.springMaiil.utils.PayloadUtil;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class MailController {

    @Autowired
    MailService mailService;


    //    send email
    @PostMapping("/sendMail")
    public ResponsePayload sendEmail(@Valid @RequestBody MailModel mailModel, HttpServletResponse res) {
        return mailService.sendEmail(mailModel, res);
    }

    //    handle errors
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponsePayload handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        Map<String, Object> errorObject = new HashMap<>();
        errorObject.put("error", errors);

        return PayloadUtil.setPayload(AppConfig.BAD_REQUEST_MSG, AppConfig.BAD_REQUEST_CODE, "0", errorObject);
    }

}
