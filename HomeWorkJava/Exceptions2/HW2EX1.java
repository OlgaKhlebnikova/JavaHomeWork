/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
необходимо повторно запросить у пользователя ввод данных.*/

package HomeWorkJava.Exceptions2;

import java.util.Scanner;

public class HW2EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        boolean user = true;

        while (user==true){
            System.out.print("Введите дробное число. (Формат ввода через . ) : ");
            String num = sc.nextLine();
            try {
                float floatNum = Float.parseFloat(num);
                user = false;
                System.out.println("Ваше число: " + floatNum);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число! \n Повторите ввод:");
            }
        }
        sc.close();
    }
}
