package ir.nargil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.*;

import static ir.nargil.Constants.*;

public abstract class SendRequest {
    protected HttpPost request;

    public SendRequest(String post) {
        HttpPost request = new HttpPost(URL_ADDRESS + post);
        request.addHeader("ApiKey", "ictchallenge");
        request.addHeader("Content-Type", "application/json");
        this.request = request;
    }

    public String getResponse() throws IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = client.execute(request);
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(
                response.getEntity().getContent()));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = bufReader.readLine()) != null) {
            builder.append(line);
            builder.append(System.lineSeparator());
        }
        return builder.toString();
    }
}