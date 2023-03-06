



import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class HW6 {
   public static void main(String[] args) {
      Notebook notebook1 = new Notebook("ASUS", "4", "1000", "WINDOWS", "GREY");
      Notebook notebook2 = new Notebook("ASUS", "4", "1000", "LINUX", "BLACK");
      Notebook notebook3 = new Notebook("DELL", "4", "2000", "WINDOWS", "BLACK");
      Notebook notebook4 = new Notebook("ASUS", "16", "1000", "WINDOWS", "GREY");
      Notebook notebook5 = new Notebook("HUAWAI", "8", "1000", "WINDOWS", "BLACK");
      
      System.out.println("Здравствуйте. Это помощник по выбору ноутбука");
      
      Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2,
            notebook3, notebook4, notebook5));

      Map<String, String> sel = selectCriteria();
      sort(sel, notebooks);

   }
   static Scanner scanner = new Scanner(System.in);
   public static String scanner() {
      String scan = scanner.nextLine();
      return scan;
   }

   public static Map<String, String> selectCriteria() {
      Map<String, String> resultCriterias = new HashMap<>();
      while (true) {
         
         System.out.println("\nХотите выбрать критерий ноутбука? Если да введите 'y', если нет введите 'n'");
         String question = scanner();
         if (question.equals("n")) {
            break;
         } else {

            System.out.println(
                  "Введите цифру, соответствующую необходимому критерию: \n 1 - Фирма производитель \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
            String key = scanner();
            System.out.println("Введите значения для выбранного критерия: ");
            String value =scanner().toUpperCase();
            
              
            resultCriterias.put(key, value);
         }
      }
      System.out.println(resultCriterias);
      return resultCriterias;

   }

   public static void sort(Map<String, String> criterias, Set<Notebook> notebooks) {

      Set<Notebook> temp = new HashSet<>(notebooks);
      for (Notebook notebook : notebooks) {

         for (Object pair : criterias.keySet()) {

            if (pair.equals("1") && !notebook.getName().equals(criterias.get(pair))) {
               temp.remove(notebook);
            }
            for (Object pair1 : criterias.keySet()) {

               if (pair1.equals("2") && !notebook.getRam().equals(criterias.get(pair1))) {
                  temp.remove(notebook);

               }
               for (Object pair2 : criterias.keySet()) {

                  if (pair2.equals("3") && !notebook.getHardDisk().equals(criterias.get(pair2))) {
                     temp.remove(notebook);

                  }
                  for (Object pair3 : criterias.keySet()) {

                     if (pair3.equals("4") && !notebook.getOperatingSystem().equals(criterias.get(pair3))) {
                        temp.remove(notebook);

                     }
                     for (Object pair4 : criterias.keySet()) {

                        if (pair4.equals("5") && !notebook.getColour().equals(criterias.get(pair4))) {
                           temp.remove(notebook);

                        }
                     }
                  }
               }
            }
         }

      }
      if (temp.isEmpty()) {
         System.out.println("По введенным критериям ничего не найдено.");
      } else {
         System.out.println("\nВот что мы можем предложить: \n" + temp.toString());
      }

   }

}
