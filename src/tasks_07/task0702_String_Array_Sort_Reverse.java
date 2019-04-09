package tasks_07;

public class task0702_String_Array_Sort_Reverse {
/*
Массив из строчек в обратном порядке
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

Требования:
1. Программа должна создавать массив на 10 строк.
2. Программа должна считывать 8 строк для массива с клавиатуры.
3. Программа должна выводить на экран 10 строк, каждую с новой строки.
4. Программа должна выводить на экран массив (10 элементов) в обратном порядке.

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] list = new String [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i ++){
            list[i] = reader.readLine();
        }
        for (int i = list.length-1; i >= 0; i--){
            System.out.println(list[i]);
        }
    }
}
*/
}
