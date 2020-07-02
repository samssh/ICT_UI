package ir.nargil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import static ir.nargil.Constants.*;
public class ApacheHttpClientPost {

    public static void main(String[] args) throws IOException {

        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {


            HttpPost request = new HttpPost(URL_ADDRESS+"/Init/ProgrammingLanguage");
            request.addHeader("Authorization", Constants.basicAuth);
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