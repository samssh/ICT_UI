package ir.nargil;

import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UploadFile extends SendRequest {

    public UploadFile(String path, String trackId, String description) throws IOException {
        super("/Questions/Answer");
        Token token = new Token();
        request.addHeader("Authorization", "Bearer " + token.getToken());
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addTextBody("TrackId", trackId, ContentType.TEXT_PLAIN);
        builder.addTextBody("Description", description, ContentType.TEXT_PLAIN);
        builder.addTextBody("ProgrammingLanguageId", "2",ContentType.TEXT_PLAIN);
        File f = new File(path);
        builder.addBinaryBody(
                "File",
                new FileInputStream(f)
        );
        HttpEntity multipart = builder.build();
        request.setEntity(multipart);
    }
}
