
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task1.class.getTypeName());
        FileHandler fh = new FileHandler ("BubbleSortLog.txt"); 
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int [] myArray = {4, 9, 5, 2, 3, 8, 7};
 
        boolean logic = false;
        int temp;
        while(logic == false) {
            logic = true;
            for (int i = 0; i < myArray.length-1; i++) 
            {
                if(myArray[i] > myArray[i+1])
                {
                    logic = false;
                    temp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                }
                logger.info(Arrays.toString(myArray));
            }
            
        }
        System.out.println(Arrays.toString(myArray)); 
        
    }
    
}
