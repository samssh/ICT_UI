package ir.nargil;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public  class Constants {
    static String USERNAME = "Team8555018";
    static String PASSWORD = "QK59686453";
    static String getBasicAuth(){
        String Authorization = USERNAME+":"+PASSWORD;
        return "Basic "  + (Base64.encode(Authorization.getBytes()));
    }
    static final String Api_key = "ictchallenge";
    static final String Content_Type = "application/json";
    static final String URL_ADDRESS = "http://94.182.190.122";
    static final String USER_INFO_PATH = "src/main/java/ir/nargil/userInfo.json";
}
