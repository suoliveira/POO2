package chainOfResponsibility.middleware;
import java.lang.String;

public class BrazilianMiddleware extends Middleware{


    public BrazilianMiddleware() {

    }

    @Override
    public boolean check(String email, String password) {
        if (email.endsWith(".br")) {
            System.out.println("Vaza fdp");
            return false;
        }else
            return checkNext(email, password);
    }

    @Override
    protected boolean checkNext(String email, String password) {
        return super.checkNext(email, password);
    }
}
