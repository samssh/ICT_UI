import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import models.Team;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class ApacheHttpClientPost {

    public static void main(String[] args) throws IOException {

        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {

            String Authorization = "Team8555018:QK59686453";
            String basicAuth = "Basic"  + (Base64.encode(Authorization.getBytes()));
            HttpPost request = new HttpPost("http://94.182.190.122/Init/ProgrammingLanguage");
            request.addHeader("Authorization", basicAuth);
            request.addHeader("ApiKey", "ictchallenge");
            request.addHeader("Content-Type", "application/json");

            //ObjectMapper objectMapper = new ObjectMapper();
            // Team team = new Team("Nargil", )
            //request.setEntity(new StringEntity("My test data"));

            HttpResponse response = client.execute(request);

            BufferedReader bufReader = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));

            StringBuilder builder = new StringBuilder();

            String line;

            while ((line = bufReader.readLine()) != null) {

                builder.append(line);
                builder.append(System.lineSeparator());
            }


            System.out.println(builder);
        }
    }
}