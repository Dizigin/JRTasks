package tasks_08;

public class task0812_the_longest_sequence {
/*
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = 10;
        int counter = 0;
        int max = 0;
        for (int i = 0; i < arraySize; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < arraySize - 1; i++){
            if (list.get(i).equals(list.get(i + 1))){
                counter++;
            }
            else {
                if (max < counter) max = counter + 1;
                counter = 0;
            }
            if (max <= counter) max = counter + 1;
        }
        System.out.println(max);
    }
}
*/
}
