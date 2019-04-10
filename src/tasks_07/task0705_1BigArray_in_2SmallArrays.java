package tasks_07;

public class task0705_1BigArray_in_2SmallArrays {
/*
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массива на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести его на экран.

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        int [] smallArray1 = new int[10];
        int [] smallArray2 = new int[10];
        for (int i = 0; i < smallArray1.length; i++){
            smallArray1[i] = array[i];
        }
        for (int i = 0; i < smallArray2.length; i++) {
                smallArray2[i] = array[i+10];
        }
        for (int i = 0; i < smallArray2.length; i++){
            System.out.println(smallArray2[i]);
        }
    }
}
*/
}
