package spring.service.springMaiil.config;

import javax.servlet.http.HttpServletResponse;

public class AppConfig {

    public static final String EMAIL_USERNAME = ""; //your email address
    public static final String EMAIL_PASSWORD = ""; //your email password
    public static final String EMAIL_PORT="587";
    public static final String EMAIL_HOST="smtp.gmail.com";

    public static final String API_TITLE="SPRING EMAIL SERVICE";
    public static final String API_CONTACT="MALINGA SIMUCHIMBA";
    public static final String API_DEVELOPER_EMAIL="malinga.simuchimba@gmail.com";
    public static final String API_DEVELOPER_URL="https://github.com/Malinga-hub/springboot-mongodb-jwt-api-template";
    public static final String API_DESCRIPTION="Springboot powered email service";
    public static final String API_VERSION="1.0.0";

    public static final String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08" +
            "\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*" +
            "[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|" +
            "[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

    public static final String BAD_REQUEST_MSG="BAD REQUEST";
    public static final int BAD_REQUEST_CODE= HttpServletResponse.SC_BAD_REQUEST;
    public static final String INTERNAL_SERVER_ERROR_MSG = "INTERNAL SERVER ERROR";
    public static final int INTERNAL_SERVER_ERROR_CODE = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
    public static final String SUCCESS_MSG="SUCESS";
    public static final int SUCCESS_CODE= HttpServletResponse.SC_OK;
}
