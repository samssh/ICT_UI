package ir.nargil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Token getToken = new Token();
        String token = getToken.getResponse();
        System.out.println(token);
    }
}
