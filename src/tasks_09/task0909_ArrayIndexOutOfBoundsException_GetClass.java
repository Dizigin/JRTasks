package tasks_09;

public class task0909_ArrayIndexOutOfBoundsException_GetClass {
/*
Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;

Требования:
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int[] m = new int[2];
            m[8] = 5;
        }
        catch(ArrayIndexOutOfBoundsException aio){
            System.out.println(aio.getClass());
        }
        //напишите тут ваш код
    }
}
*/
}
