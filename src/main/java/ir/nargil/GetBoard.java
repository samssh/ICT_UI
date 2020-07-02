package ir.nargil;

import org.apache.http.entity.StringEntity;

import java.io.IOException;

public class GetBoard extends SendRequest{
    public GetBoard(String post) throws IOException {
        super(post);
        Token token = new Token();
        request.addHeader("Authorization", "Bearer " + token.getToken());
       //request.setEntity(new StringEntity("{\"ProgrammingLanguageId\" : 2}"));
    }
}
