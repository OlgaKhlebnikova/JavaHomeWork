

import java.util.HashMap;
import java.util.Map;

//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class task2 {
    public static void main(String[] args) {
        Map<String, Integer> listWorkers = new HashMap<>();
        String workers = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов ";

        String[] NamesLastNames = workers.split(" ");
        
        for (int i = 0; i < NamesLastNames.length; i += 2) {
            if (listWorkers.containsKey(NamesLastNames[i])) {
                listWorkers.replace(NamesLastNames[i], listWorkers.get(NamesLastNames[i]) + 1);
                
            } else {
                listWorkers.put(NamesLastNames[i], 1);
            }
        }
        System.out.println("\nСписок имен:");
      
        System.out.println(listWorkers);

        System.out.println("\nСписок имен по обыванию популярности:");
        listWorkers.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

}
