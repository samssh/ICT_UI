package ir.nargil;

import org.apache.http.entity.StringEntity;

import java.io.IOException;

public class GetBoard extends SendRequest{
    public GetBoard() throws IOException {
        super("/Questions/Score");
        request.addHeader("Content-Type", Constants.Content_Type);
        Token token = new Token();
        request.addHeader("Authorization", "Bearer " + token.getToken());
    }
}
