package HomeWorkJava;

import java.util.Scanner;

public class gh {
    public static void main(String[] args) {
        
        //Scanner iScanner = new Scanner(System.in);
        //System.out.print("Введите число : ");
        //int number = iScanner.nextInt();
        //iScanner.close();
        int a; // если заменить на doble бедет считать точнее ;)
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
        if (op == '+'){
            res = a + b;}
        else if(op == '-') {res = a - b;}
        else if(op == '*') {res = a * b;}
        else if(op == '/') {res = a / b;}
        else System.out.printf("Неверный ввод !");
        System.out.print("\n   Ответ:\n");
        System.out.printf(a + " " + op + " " + b + " = " + res);
    } 
}

