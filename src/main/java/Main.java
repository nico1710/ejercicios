public class Main {
    public static void main(String[] args) {

    }

    public static String crearPassword() {
        int largo = 0;
        String NUMEROS = "0123456789";
        String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";

        String key = NUMEROS + MAYUSCULAS + MINUSCULAS;
        StringBuilder password = new StringBuilder();
        largo = 6 + (int) (Math.random() * 4);

        for(int i=0; i<largo; i++) {
            password.append(key.charAt((int) (Math.random() * key.length())));
        }
        return password.toString();
    }
}
