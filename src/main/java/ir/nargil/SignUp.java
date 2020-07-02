package ir.nargil;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ir.nargil.SendRequest;
import ir.nargil.models.Member;
import ir.nargil.models.Team;
import org.apache.http.entity.StringEntity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Scanner;

public class SignUp extends SendRequest {
    private Team team;

    public SignUp () throws JsonProcessingException, UnsupportedEncodingException, FileNotFoundException {
        super("/Authentication/SignUp");
        request.addHeader("Authorization", Constants.basicAuth);
        request.setEntity(new StringEntity(getBody()));
    }

    String getBody() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\ir\\nargil\\tmep.json");
        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()){
            stringBuilder.append(scanner.nextLine());
        }
        return stringBuilder.toString();
    }


}
