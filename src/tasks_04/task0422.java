package tasks_04;/*
18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".
Требования:
1. Программа должна дважды считать данные c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст меньше 18 вывести только сообщение "Подрасти еще".
4. Если возраст больше либо равно 18 ничего не выводить.
*/
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class task0422 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String s = bufferedReader.readLine();
        int age = Integer.parseInt(s);

        if (age < 18) System.out.println("Подрасти еще");
    }
}
