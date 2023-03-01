package HomeWorkJava.HomeWork5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
     // Реализуйте структуру телефонной книги 
    // с помощью HashMap, учитывая, что 1 человек
    // может иметь несколько телефонов.
    public static void main(String[] args) 
    {
        Map<String, List<String>> book = new HashMap<>();
        book.put("Olga", List.of("8 888 888 88 88", "8 999 999 99 99"));
        book.put("Svetlana", List.of("8 777 777 77 77", "8 666 666 66 66"));
        book.put("Anna", List.of("8 555 555 55 55", "8 444 444 44 44"));

        menu(book);
    }
    static Scanner scanner = new Scanner(System.in);
    public static String scan()
    {
        String scan = scanner.nextLine();
        return scan;
    }

    public static void find(Map<String, List<String>> phoneBook)
    // Поиск абонента
    {
        System.out.print("Имя абонента: ");
        String name = scan();
        System.out.println("\nИмя: "+ name +"\nТелефон(ы): "+ phoneBook.get(name));
    }

    public static void printBook(Map<String, List<String>> bookPhone) 
    // Печать книги
    {
        for (var item : bookPhone.entrySet()) 
        {
            System.out.println("Имя: " + item.getKey() + "\nНомер" + item.getValue());
        }
    }

    public static Map<String, List<String>> add(Map<String, List<String>> book) 
    // Добавление в тел. книгу
    {
        System.out.print("Имя абонента: ");
        String name = scan();
        List<String> data = new ArrayList<>();
        while (true) {
            System.out.println("Если номеров больше нет, введите '0'");
            System.out.print("Введите номер: ");
            String nomer = scan();
            if (nomer.equals("0")) {
                break;
            } else {
                data.add(nomer);
            }
        }
        book.put(name, data);

        return book;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> book) {
        while (true) {
            System.out.println( "    --------------\n   Телефонная Книга\n    --------------\n" +
                "        Меню: \n1. Найти контакт \n2. Добавить контакт"+
                " \n3. Печать телефонной книги \n4. Выход");
            System.out.print("\nвыберите пункт меню-> ");
            String comands = scan();
            if (comands.equals("4")) {
                break;
            } else {
                switch (comands) {
                    case "1":
                        find(book);
                        break;
                    case "2":
                        add(book);
                        break;
                    case "3":
                        printBook(book);
                        break;
                    default:
                        break;
                }
            }
        }
        return book;
    }    
}

