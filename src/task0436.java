/*
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
Требования:
1. Программа должна считывать два числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить прямоугольник размером m на n из восьмёрок.
4. В программе должен использоваться цикл for.
*/
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class task0436 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader InputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(InputStreamReader);
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        int i,j,k=8;
        int m = Integer.parseInt(s1);
        int n = Integer.parseInt(s2);
        for (i=m; i > 0; i--){
            for (j=n-1; j > 0; j--){
                System.out.print(k);
            }
            System.out.println(k);
        }
    }
}
