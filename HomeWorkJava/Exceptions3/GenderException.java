package HomeWorkJava.Exceptions3;

public class GenderException extends Exception {
    public GenderException() {
    }

    public void GenderException(String i) {
        System.out.println("Exception: GenderNotCorrectData");
        System.out.printf("Это неверные данные: %s", i);
        System.out.println();
    }
}