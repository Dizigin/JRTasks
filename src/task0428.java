/*
Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2
б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить количество положительных чисел в исходном наборе.
4. Если положительных чисел нет, программа должна вывести "0".
5. Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class task0428 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        if (a<=0 && b<=0 && c<=0) System.out.println("0");
        if ((a>0 && b<=0 && c<=0)||(a<=0 && b>0 && c<=0)||(a<=0 && b<=0 && c>0)) System.out.println("1");
        if ((a>0 && b>0 && c<=0)||(a>0 && b<=0 && c>0)||(a<=0 && b>0 && c>0)) System.out.println("2");
        if (a> 0 && b> 0 && c> 0) System.out.println("3");
    }
}
