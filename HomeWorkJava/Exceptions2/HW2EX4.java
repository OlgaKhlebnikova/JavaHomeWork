/*Разработайте программу, которая выбросит Exception, 
когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */
package HomeWorkJava.Exceptions2;

import java.util.Scanner;

public class HW2EX4 {
    public static void main(String[] args) {
        System.out.print("Введите данные: ");
        Scanner sc = new Scanner(System.in);
        String userStrig = sc.nextLine();
        if (!userStrig.isEmpty()){
            System.out.println("Вы ввели: " + userStrig);
            
        } else {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        sc.close(); 
    }
    
}

