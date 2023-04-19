package HomeWorkJava.Exceptions3;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("Это неправильный формат даты: %s", i);
        System.out.println();
    }
}
