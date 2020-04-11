package tasks_09;

public class task0905_StackTrace_getStackTraceDepth {
/*
Там, в синих глубинах стек-трейса…
Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.

Требования:
1. Метод getStackTraceDepth должен возвращать глубину своего стек-трейса.
2. Метод getStackTraceDepth должен выводить на экран глубину своего стек-трейса.
3. Воспользуйся методом Thread.currentThread().getStackTrace().
4. Метод main должен вызывать метод getStackTraceDepth.

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        int b = 0;
        StackTraceElement a[] = Thread.currentThread().getStackTrace();
        b = a.length;
        System.out.println(b);
        return b;
    }
}
*/
}
