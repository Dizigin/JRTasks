package tasks_07;

public class task0721_MinAndMax {
/*
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int minimum;
        int crack[] = new int[20];
        for (int i = 0; i < crack.length; i++){
            String s = reader.readLine();
            crack[i] = Integer.parseInt(s);
        }
        maximum = crack[0];
        for (int i = 0; i < crack.length; i++){
            if (crack[i] > maximum)
                maximum = crack[i];
        }
        minimum = crack[0];
        for (int i = 0; i < crack.length; i++){
            if (crack[i] < minimum)
                minimum = crack[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}
*/
}
