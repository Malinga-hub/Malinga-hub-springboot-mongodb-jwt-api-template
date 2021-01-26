package spring.service.springMaiil.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import spring.service.springMaiil.config.AppConfig;
import spring.service.springMaiil.pojos.MailModel;
import spring.service.springMaiil.pojos.ResponsePayload;
import spring.service.springMaiil.utils.PayloadUtil;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@Service
public class MailService {

    @Autowired
    JavaMailSender mailSender;

    //    send email
    public ResponsePayload sendEmail(MailModel mailModel, HttpServletResponse res) {
        ResponsePayload responsePayload;

        MimeMessage mimeMessage = mailSender.createMimeMessage();

        try {

            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

            mimeMessageHelper.setSubject(mailModel.getMailSubject());
            mimeMessageHelper.setFrom(new InternetAddress(mailModel.getMailFrom(), mailModel.getPersonnel()));
            mimeMessageHelper.setTo(mailModel.getMailTo());
            mimeMessageHelper.setText(mailModel.getMailContent());

            mailSender.send(mimeMessageHelper.getMimeMessage());

            responsePayload = PayloadUtil.setPayload(AppConfig.SUCCESS_MSG, AppConfig.SUCCESS_CODE, "1", mailModel);

        } catch (Exception e) {
            Map<String, String> errors = new HashMap<>();
            errors.put("record", e.getMessage());

            Map<String, Object> errorObject = new HashMap<>();
            errorObject.put("error", errors);

            responsePayload = PayloadUtil.setPayload(AppConfig.INTERNAL_SERVER_ERROR_MSG, AppConfig.INTERNAL_SERVER_ERROR_CODE, "0", errorObject);
        }

        return responsePayload;
    }


}
