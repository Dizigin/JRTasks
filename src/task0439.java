import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Письмо счастья
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: "*имя* любит меня."
Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Требования:
1. Программа должна считывать имя c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить 10 раз текст указанный в задании.
4. В программе должен использоваться цикл for.
*/
public class task0439 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s = bufferedReader.readLine();
        for (int i = 1; i <= 10; i++){
            System.out.println(s + " любит меня.");
        }
    }
}