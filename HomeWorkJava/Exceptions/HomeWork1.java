//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

package HomeWorkJava.Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] firstArray = getFilledArray(10);
        int[] secondArray = getFilledArray(10);

        
        System.out.println("Первый массив  " +Arrays.toString(firstArray));
        System.out.println("Второй массив " +Arrays.toString(secondArray));
        System.out.println("Разница двух  массивов " + Arrays.toString(divArrays(firstArray, secondArray)));
        System.out.println("Частное двух массивов " + divideArray(firstArray, secondArray));
    }

    public static int[] divArrays(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) throw new RuntimeException("Длины массивов не равны!");
        int[] resultArr = new int[firstArray.length];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = firstArray[i] - secondArray[i];
        }
        return resultArr;
    }

    public static int[] getFilledArray(int length){
        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(20);
        }
        return array;
    }

    public static ArrayList<Float> divideArray(int[] a1, int[] a2) {
        ArrayList<Float> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("Один из массивов пуст");
        }
        if (min < max) {
            throw new RuntimeException("Длинны массивов не равны!");
        }
        for (int i = 0; i < min; i++) {
            if (a2[i] != 0) {
                res.add((float) (a1[i] / a2[i]));
            } else {
                throw new RuntimeException("Деление на ноль");
            }
        }
        return res;
    }
    
}
