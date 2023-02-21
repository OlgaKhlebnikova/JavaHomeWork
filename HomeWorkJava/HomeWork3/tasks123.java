package HomeWorkJava.HomeWork3;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class tasks123 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Выберите задачу 1,2,3 : ");
        int num = iScanner.nextInt();
        if(num == 1) {Task1();}
        if(num == 2) {Task2();}
        if(num == 3) {Task3();}
        iScanner.close();
        //Task1();//Реализовать алгоритм сортировки слиянием
        //Task2();//Пусть дан произвольный список целых чисел, удалить из него четные числа
        //Task3();//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    }
    static void Task1(){
        System.out.println("\nРеализовать алгоритм сортировки слиянием");
        int min = -10;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int[] arrayToSort = new int[9];
        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(diff + 1) + min;}
        System.out.println("Исходный массив" + Arrays.toString(arrayToSort));     
        int[] result = mergesort(arrayToSort);
        System.out.println("Отсортированный массив" + Arrays.toString(result) + "\n");
    }
 
    public static int[] mergesort(int[] arrayToSort) {
        int[] tempArr = Arrays.copyOf(arrayToSort, arrayToSort.length);
        int[] temp2 = new int[arrayToSort.length];
        int[] result = mergesortInner(tempArr, temp2, 0, arrayToSort.length);
        return result;
    }
 
    public static int[] mergesortInner(int[] tempArr, int[] temp2, int start, int end) {
        if (start >= end - 1) {
            return tempArr;
        }
        
        int middle = start + (end - start) / 2;
        int[] sorted1 = mergesortInner(tempArr, temp2, start, middle);
        int[] sorted2 = mergesortInner(tempArr, temp2, middle, end);
        
        int i = start;
        int j = middle;
        int index = start;
        int[] result = sorted1 == tempArr ? temp2 : tempArr;
        while (i < middle && j < end) {
            result[index++] = sorted1[i] < sorted2[j]
                    ? sorted1[i++] : sorted2[j++];
        }
        while (i < middle) {
            result[index++] = sorted1[i++];
        }
        while (j < end) {
            result[index++] = sorted2[j++];
        }
        return result;
     
    }


    static void Task2(){
        System.out.print("\nПусть дан произвольный список целых чисел, удалить из него четные числа\n");
        Random rand = new Random();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            myList.add(rand.nextInt(100));}
        System.out.println("Исходный массив" + myList);
        for (int i = 0; i < myList.size(); i++){

            if (myList.get(i) % 2 == 0){
                myList.remove(i);
                i--;
        }
        }
        System.out.println("Массив нечетных чисел: " + myList + "\n");
    }


    static void Task3(){
        System.out.print("\nЗадан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.\n");
        Random rand = new Random();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {//Массив из 5 элементов для наглядности
            myList.add(rand.nextInt(100));}
        double sum = 0;
        for (int i = 0; i < myList.size(); i++)
        {
            sum += myList.get(i);}    
        System.out.println(myList);    
        System.out.println("Максимальное значение: " + Collections.max(myList));
        System.out.println("Минимальное значение: " + Collections.min(myList)); 
        System.out.println("Cреднее арифметическое: " + sum/myList.size() + "\n");
        }  
    
}
