import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class task0442 {
/*    Суммирование
    Вводить с клавиатуры числа.
    Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
            -1 должно учитываться в сумме.

    Подсказака: один из вариантов решения этой задачи, использовать конструкцию:

            while (true) {
        int number = считываем число;
        if (проверяем, что number -1)
        break;
    }
*/
public static void main(String[] args) throws Exception {
    int sum = 0;
    while(true) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s1 = bufferedReader.readLine();
        int a = Integer.parseInt(s1);
        sum = sum + a;
        if (a == -1) {
            System.out.println(sum);
            break;
        }
    }
}

}
