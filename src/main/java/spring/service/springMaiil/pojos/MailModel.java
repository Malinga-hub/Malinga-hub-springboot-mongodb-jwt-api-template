package spring.service.springMaiil.pojos;

import io.swagger.annotations.ApiModelProperty;
import spring.service.springMaiil.config.AppConfig;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

public class MailModel {

    @ApiModelProperty(required = true)
    @NotEmpty(message = "mailFrom is required")
    @Pattern(regexp = AppConfig.EMAIL_REGEX, message = "Invalid email")
    private String mailFrom;

    @ApiModelProperty(required = true)
    @NotEmpty(message = "personnel is required")
    @Pattern(regexp = AppConfig.EMAIL_REGEX, message = "Invalid email")
    private String personnel;

    @ApiModelProperty(required = true)
    @NotEmpty(message = "mailTo is required")
    @Pattern(regexp = AppConfig.EMAIL_REGEX, message = "Invalid email")
    private String mailTo;

    private String mailCc;

    private String mailBcc;

    @ApiModelProperty(required = true)
    @NotEmpty(message = "mailSubject is required")
    private String mailSubject;

    @ApiModelProperty(required = true)
    @NotEmpty(message = "mailContent is required")
    private String mailContent;

    private String contentType;

    private List<Object> attachments;

    public String getPersonnel() {
        return personnel;
    }

    public void setPersonnel(String personnel) {
        this.personnel = personnel;
    }

    public String getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getMailCc() {
        return mailCc;
    }

    public void setMailCc(String mailCc) {
        this.mailCc = mailCc;
    }

    public String getMailBcc() {
        return mailBcc;
    }

    public void setMailBcc(String mailBcc) {
        this.mailBcc = mailBcc;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }
}
