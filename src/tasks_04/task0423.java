package tasks_04;/*
Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".
Требования:
1. Программа должна считывать строки c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
4. Если возраст меньше либо равно 20 ничего не выводить.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class task0423 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String s = bufferedReader.readLine();
        int age = Integer.parseInt(s);

        if (age > 20) System.out.println("И 18-ти достаточно");
    }
}
