package exceptions;

public class CheckedVsNotChecked {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("fim");
    }

    static void geraErro1() {
        throw new RuntimeException("Deu erro :)");
    }

    static void geraErro2() throws Exception {
        throw new Exception("Vish deu outro erro kk");
    }
}
