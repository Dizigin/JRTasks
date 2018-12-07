import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class task0507 {
/*
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
Примеры:
а) при вводе чисел
1
2
2
4
5
-1
получим вывод
2.8
б) при вводе чисел
4
3
2
1
-1
получим вывод
2.5
Подсказака: один из вариантов решения этой задачи, использовать конструкцию:
while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. После ввода -1 программа должна корректно завершить работу.
4. Если последовательно ввести: 1, 2, 2, 4, 5 и -1, программа должна вывести 2.8.
5. Если последовательно ввести: -100, 0, 100 и -1, программа должна вывести 0.0.
6. Если последовательно ввести: 1 и -1, программа должна вывести 1.0.
7. Выведенный результат должен соответствовать заданию для любых входных данных.

    public class Solution {
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            double sum = 0,counter = 0;
            double avg;
            while (true) {
                InputStream inputStream = System.in;
                Reader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String s1 = bufferedReader.readLine();
                double number = Integer.parseInt(s1);
                if (number == -1) {
                    break;
                }
                else {
                    counter ++;
                    sum = sum + number;
                }
            }
            avg=sum/counter;
            //System.out.println("Сумма: " + sum);
            //System.out.println("Счетчик: " + counter);
            System.out.println(avg);
        }
    }
*/
}
