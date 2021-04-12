package tasks_10;

public class task1007_Casting_Primitive_Data_Types_6 {
/*
Задача №7 на преобразование целых типов
Убери ненужные операторы приведения типа, чтобы получился ответ: 1234567.
long l = (byte)1234_564_890L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x - (float)m;
l = (long) f / 1000;

Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную l типа long.
4. Метод main() должен содержать переменную x типа int.
5. Метод main() должен содержать переменную m типа double.
6. Метод main() должен содержать переменную f типа float.
7. Значения переменных менять нельзя. Можно добавлять только операторы приведения типа.
8. Программа должна выводить текст 1234567.

public class Solution {
    public static void main(String[] args) {
        //long l = (byte) 1234_564_890L;
        long l = 1234_564_890L;
        //int x = (byte) 0b1000_1100_1010;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        //float f = (byte) l++ + 10 + ++x - (float) m;
        float f = l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
        //System.out.println("l = " + Integer.parseInt("11101000", 8));
        //System.out.println("l = " + l);
        //System.out.println("x = " + x);
        //System.out.println("m = " + m);
        //System.out.println("f = " + f);
        //System.out.println("l = " + l);
    }
}
 */
}
