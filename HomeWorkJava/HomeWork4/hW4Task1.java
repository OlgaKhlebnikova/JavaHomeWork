package HomeWorkJava.HomeWork4;

import java.lang.System.Logger;
import java.sql.Date;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class hW4Task1 {
    public static void main(String[] args) {          
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Выберите задачу 1,2,3 : ");
        int num = iScanner.nextInt();
        if(num == 1) {Task1();}
        if(num == 2) {Task2();}
        if(num == 3) {Task3();}
        iScanner.close();
        //Task1();//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет перевернутый список.
        //Task2();//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
        //dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
        //Task3();//В калькулятор добавьте возможность отменить последнюю операцию.
    }
        public static void Task1(){
            System.out.println("\nПусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет 'перевернутый' список.");
            LinkedList<Integer> linList = new LinkedList<Integer>();
            for (int i = 0; i < 8; i++) {
                    linList.add(i,i); 
                }

            System.out.println("Исходный список: " +linList);    
            System.out.println("Итоговый список: " + reversLiunkedList(linList)); 
        }
           
        public static LinkedList<Integer> reversLiunkedList(LinkedList<Integer> listInit)
        {
            LinkedList<Integer> resList = new LinkedList<>();
            for (int i = listInit.size()-1; i >= 0; i--) {
                resList.add(listInit.get(i));
            }
            return resList;
        }

        
        public static void Task2(){
        System.out.print("\nРеализуйте очередь с помощью LinkedList со следующими методами:enqueue(),dequeue(),first()\n");
        LinkedList<Integer> linList = new LinkedList<>();
        linList.add(1); 
        linList.add(2);
        linList.add(3);
        linList.add(4);
        System.out.println("Исходный список: " +linList+ "\n");

        
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число, которое нужно добываить в список: ");
        int num = iScanner.nextInt();
        iScanner.close();
        System.out.println("Добавление элемeнта в конец: " +enqueue(linList, num) + "\n");
        System.out.println("Возвращает первый элемент из очереди и удаляет его. Первый элемент -  " + dequeue(linList) +". Список без первого элемента "+ linList +"\n");
        //enqueue(linList, 7); // помещает элемент в конец очереди  и выводит в консоль
       // dequeue(linList);         // возвращает первый элемент из очереди, удаляет его и выводит в консоль список
        System.out.println("Возвращает первый элемент из очереди, не удаляя. Первый элемент -  " + first(linList) +". Список  "+ linList +"\n"); // возвращает первый элемент из очереди, не удаляя и выводит его в консоль
        
        }
                
        public static LinkedList<Integer> enqueue (LinkedList<Integer> list, int num)  {
            list.addLast(num);
            //System.out.println(list);   
            return list;
        } 
        public static int dequeue (LinkedList<Integer> listll){
            int temp = listll.get(0);
            listll.removeFirst();
            return temp;
        } 
        public static int first (LinkedList<Integer> list) {
            return list.getFirst();
        }
        
    
    
        
        public static void Task3(){
        System.out.print("\nВ калькулятор добавьте возможность отменить последнюю операцию.\n");
        //System.out.println("Хотите работать с калькулятором? 1 - да, 0 - нет: ");
        Deque<Integer> deque = new ArrayDeque<>();
        int choice = 1;
        while (choice == 1) {   
            System.out.println("Введите первое число:");        
            int operand1 = nextInt();
            System.out.println("Введите второе число:");   
            int operand2 = nextInt();
            char operation = getOperation();
            int result = calc(operand1,operand2,operation);
            System.out.println("Результат операции: "+result);
            deque.add(result);
            System.out.println("История операций" + deque );
                                      
            System.out.println("\nХотите удалить предыдущее действие 1 - да, 0 - нет: ");
            int check = nextInt();
            if (check == 1) {
                deque.removeLast();
                System.out.println("История операций" + deque );
            }
            System.out.println("\nХотите продолжить рабтоу с калькулятором? 1 - да, 0 - нет: ");
            choice = nextInt();    
            if (choice==0){
            System.out.println("Спасибо за работу");
            }
            //}
            
            
        }
        
        
    }
        static Scanner scanner = new Scanner(System.in);
        public static int nextInt(){
            //System.out.println("Введите число:");
            int operand;
            if(scanner.hasNextInt()){
                operand = scanner.nextInt();
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                scanner.next();//рекурсия
                operand = nextInt();
            }
            return operand;
        }

        public static char getOperation(){
            System.out.println("Введите операцию :");
            char operation;
            if(scanner.hasNext()){
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                scanner.next();//рекурсия
                operation = getOperation();
            }
            return operation;
        }

        public static int calc(int operand1, int operand2, char operation){
            int result;
            switch (operation){
                case '+':
                    result = operand1+operand2;
                    break;
                case '-':
                    result = operand1-operand2;
                    break;
                case '*':
                    result = operand1*operand2;
                    break;
                case '/':
                    result = operand1/operand2;
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
                    result = calc(operand1, operand2, getOperation());//рекурсия
            }
            return result;
        }

    }  

