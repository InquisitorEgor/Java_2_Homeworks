package java2.chat.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Library {
    /*
     * /auth_request§login§password
     * /auth_accept§nickname
     * /auth_error
     * /msg_format_error
     * /broadcast§msg
     * */
    public static final String DELIMITER = " ";
    public static final String AUTH_REQUEST = "authorization_request";
    public static final String AUTH_ACCEPT = "authorized successfully";
    public static final String AUTH_DENIED = "authorization denied";
    public static final String MSG_FORMAT_ERROR = "wrong message format";
    public static final String TYPE_BROADCAST = "(to all):";
    public static final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss: ");

    public static String getAuthRequest(String login, String password) {
        return AUTH_REQUEST + DELIMITER + login + DELIMITER + password;
    }

    public static String getAuthAccept(String nickname) {
        return dateFormat.format(System.currentTimeMillis())+nickname + DELIMITER +AUTH_ACCEPT ;
    }

    public static String getAuthDenied() {
        return dateFormat.format(System.currentTimeMillis())+AUTH_DENIED;
    }

    public static String getMsgFormatError(String message) {
        return MSG_FORMAT_ERROR + DELIMITER + message;
    }

    public static String getTypeBroadcast(String src, String message) {

        return dateFormat.format(System.currentTimeMillis()) + src +TYPE_BROADCAST + DELIMITER + message;
    }
}
