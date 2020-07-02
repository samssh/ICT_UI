package ir.nargil;

public class Token extends SendRequest{
    public Token() {
        super("/Authentication/SignIn");
        request.addHeader("Authorization", Constants.basicAuth);
    }
}
