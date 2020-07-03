package ir.nargil;

import org.apache.http.entity.StringEntity;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class SendMessage extends SendRequest{

    public SendMessage(String post, String text, int dependedOn) throws IOException {
        super(post);
        request.addHeader("Content-Type", Constants.Content_Type);
        StringEntity stringEntity;
        if (dependedOn == -1){
            stringEntity = new StringEntity("{\n" +
                    "  \"Text\": " + "\"" + text + "\"" +
                    "}");
        }else {
            stringEntity = new StringEntity("{\n" +
                    "  \"Text\": \"" + text + "\" ,\n" +
                    "  \"DependetOn\": " + dependedOn +" \n" +
                    "}");
        }


        request.setEntity(stringEntity);
        Token token = new Token();
        request.addHeader("Authorization", "Bearer " + token.getToken());
    }
}
