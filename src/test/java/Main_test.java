import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main_test {
    public String passCheck = Main.crearPassword();

    @Test
    public void check_length() {
        //entre 6 y 10 caracteeres
        int passLength = passCheck.length();
        Assertions.assertTrue(passLength>= 6 || passLength<=10);
    }

    @Test
    public void check_aphanum() {
        Assertions.assertTrue(passCheck.matches("^[A-Za-z0-9]*$"));
    }

    @Test
    public void check_alpha() {
        boolean flag = false;

        for(int i=0; i<passCheck.length(); i++) {
            if(Character.isUpperCase(passCheck.charAt(i))) {
                flag = true;
                break;
            }
        }

        Assertions.assertTrue(flag);
    }

    @Test
    public void check_number() {
        boolean flag = false;

        for(int i=0; i<passCheck.length(); i++) {
            if(Character.isDigit(passCheck.charAt(i))) {
                flag = true;
                break;
            }
        }

        Assertions.assertTrue(flag);
    }
}
