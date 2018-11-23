import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class task0441 {
/*    Как-то средненько
    Ввести с клавиатуры три числа, вывести на экран среднее из них.
    Т.е. не самое большое и не самое маленькое.
    Если все числа равны, вывести любое из них.
            Требования:
            1. Программа должна считывать числа c клавиатуры.
            2. Программа должна выводить число на экран.
            3. Программа должна выводить среднее из трех чисел.
            4. Если все числа равны, вывести любое из них.
            5. Если два числа из трех равны, вывести любое из двух.
*/
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

    if (a <= b && b <= c) {
        System.out.println(b);
    }
    if (b < a && a < c){
        System.out.println(a);
    }
    if (c < a && a < b){
        System.out.println(a);
    }
    if (a < c && c < b){
        System.out.println(c);
    }
    if (a > c && c > b){
        System.out.println(c);
    }
    if (a > b && b > c){
        System.out.println(b);
    }
    if (a == b && b > c){
        System.out.println(a);
    }
    if (a == c && b > c){
        System.out.println(a);
    }
    if (a == c && b < c) {
        System.out.println(a);
    }
        /*if (a < c && b == c) {
            System.out.println(b);
        }*/
    if (a > c && b == c) {
        System.out.println(b);
    }
  }
}
