package ir.nargil;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public  class Constants {
    static final String Authorization = "Team8555018:QK59686453";
    static final String basicAuth = "Basic "  + (Base64.encode(Authorization.getBytes()));
    static final String Api_key = "ictchallenge";
    static final String Content_Type = "application/json";
    static final String URL_ADDRESS = "http://94.182.190.122";
}
