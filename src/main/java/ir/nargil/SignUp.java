package ir.nargil;

import org.apache.http.entity.StringEntity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class SignUp extends SendRequest {
    public SignUp () throws UnsupportedEncodingException, FileNotFoundException {
        super("/Authentication/SignUp");
        request.addHeader("Authorization", Constants.getBasicAuth());
        request.addHeader("Content-Type", Constants.Content_Type);
        request.setEntity(new StringEntity(getBody()));
    }

    String getBody() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(Constants.USER_INFO_PATH);
        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()){
            stringBuilder.append(scanner.nextLine());
        }
        return stringBuilder.toString();
    }
}
