package tasks_14;

public class task_1419_exeptions {
/*
Нашествие исключений
Заполни список exceptions десятью различными исключениями.
Первое исключение уже реализовано в методе initExceptions.


Requirements:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями (потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int i = Integer.parseInt("one");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] a = new int[10];
            System.out.println(a[0]);
            System.out.println(a[100]);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object o = new Object();
            String s = (String)o;
        } catch (Exception e) {
            exceptions.add(e);
        }
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("c:/myFile.txt");

            System.out.println("Reading from text file using FileInputStream > ");
            int ch;
            while ((ch = fis.read()) != -1) { //read till end of file
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
             throw new RuntimeException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayStoreException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NotBoundException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NotActiveException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
 */
}
