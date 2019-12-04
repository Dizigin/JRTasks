package tasks_08;

public class task0814_Set_Remove_More_Then_10 {
/*
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
5. Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<Integer>();
        set.add(14);
        set.add(10);
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(235);
        set.add(567);
        set.add(0);
        set.add(345);
        set.add(98);
        set.add(15);
        set.add(11);
        set.add(90);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(9);
        set.add(45);
        set.add(456);
        set.add(34);
        return  set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 10)
                iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        //System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
*/
}
