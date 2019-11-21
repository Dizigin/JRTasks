package tasks_04;/*
Хорошего много не бывает
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
Пример ввода:
абв
2
Пример вывода:
абв
абв
Требования:
1. Программа должна считывать текст c клавиатуры.
2. Программа должна выводить текст на экран.
3. Каждое значение должно быть выведено с новой строки.
4. Программа должна выводить на экран строку N раз.
5. В программе должен использоваться цикл while.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class task0432 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        int i = 1;
        int qty = Integer.parseInt(s2);
        while (qty>=i){
            System.out.println(s1);
            qty--;
        }
    }
}
