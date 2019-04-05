public class task0622_Sort_Array {
/*
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17


Требования:
1. Программа должна считывать 5 чисел с клавиатуры.
2. Программа должна выводить 5 чисел, каждое с новой строки.
3. Выведенные числа должны быть отсортированы по возрастанию.
4. Вывод должен содержать те же числа, что и были введены (порядок не важен).

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int elem = 5;
        int[] array = new int[elem];
        for (int i = 0; i < elem; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < elem; i++) {
            Arrays.sort(array);
            System.out.println(array[i]);
        }
    }
}
*/
}
