import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


// Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена 
// с количеством повторений. Отсортировать по убыванию популярности Имени.
public class task2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String workers = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] listNamesLastname = workers.split(" ");
        for (int i = 0; i < listNamesLastname.length; i += 2) {
            if (nameMap.containsKey(listNamesLastname[i])) {
                nameMap.replace(listNamesLastname[i], nameMap.get(listNamesLastname[i]) + 1);
            } else {
                nameMap.put(listNamesLastname[i], 1);
            }
        }
        System.out.println("Спиок имен с количеством повторений: " +nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println("Повторений имен с количеством, отсортированное по убыванию: " );
        sortedNameMap.forEach((key, value) -> System.out.println(key + " : " + value));
        
    }
}
