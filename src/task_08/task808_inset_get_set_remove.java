package task_08;

public class task808_inset_get_set_remove {
/*
10 тысяч удалений и вставок
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только 5 методов.
4. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
5. Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
6. Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
7. Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        int i = 0;
        while (i < 10000){
            list.add(i);
            i++;
        }
    }

    public static void get10000(List list) {
        //напишите тут ваш код
        int i = 0;
        while (i < 10000) {
            list.get(i);
            i++;
        }
    }

    public static void set10000(List list) {
        //напишите тут ваш код
        int i = 0;
        while (i < 10000) {
            list.set(i,i);
            i++;
        }
    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        int i = 0;
        while (i < 10000) {
            list.remove(0);
            i++;
        }
    }
}
*/
}
