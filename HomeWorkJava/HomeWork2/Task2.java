
import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;
import java.util.logging.*;
//К калькулятору из предыдущего дз добавить логирование.
public class Task2 {
   
    public static void main(String[] args) throws IOException {
        int a; 
        int b;
        int res = 0;
        char op;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1е число: ");
        a = sc.nextInt();        
        System.out.print("Какое действие вы хотите совершить (+, -, *, /): ");
        op = sc.next().charAt(0);
        System.out.print("Введите 2е число: ");
        b = sc.nextInt();
        sc.close();

        if (op == '+')     {res = a + b;}
        else if(op == '-') {res = a - b;}
        else if(op == '*') {res = a * b;}
        else if(op == '/') {res = a / b;}
        else System.out.printf("Неверный ввод !");

        System.out.print("\n   Ответ:\n");
        System.out.printf(a + " " + op + " " + b + " = " + res + "\n");

        Date date = new Date(op);
        
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler
        ("CalcLog.txt"); 
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        //XMLFormatter xml = new XMLFormatter();
        //fh.setFormatter(xml);

        logger.info(date.toString());
        logger.info("\nПользователь ввел 1 число = " + a  + "\nПользователь ввел 2 число = " + b + "\nПользователь ввел оператор '" + op + "'");       
        logger.info
        ("Пользователь получил ответ : " + a + " " + op + " " + b + " = " + res + "\n");
    }
}
