package HomeWorkJava.Exceptions3;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку на английском языке (строка должна содержать ФИО ПРОБЕЛ дату рождения формат - dd.mm.yyyy  ПРОБЕЛ номер телефона  ПРОБЕЛ пол - f/m ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные, пожалуйста, попробуйте еще раз");
            } else System.out.println("Вы ввели дополнительные данные, пожалуйста, попробуйте еще раз");
        }

    }
}
