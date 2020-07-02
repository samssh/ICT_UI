package ir.nargil;

import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Token extends SendRequest{
    public Token() {
        super("/Authentication/SignIn");
        request.addHeader("Authorization", Constants.basicAuth);
    }

    public String getToken() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> values =  mapper.readValue(getResponse(),new TypeReference<Map<String, Object>>(){});
        Map<String,Object> dataJson = (Map<String, Object>) values.get("data");
        return (String) dataJson.get("Token");
    }
}
