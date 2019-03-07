public class task0610_ConsoleReader {
/*
Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.

Требования:
1. Метод readString должен считывать и возвращать строку(тип String).
2. Метод readInt должен считывать и возвращать число(тип int).
3. Метод readDouble должен считывать и возвращать дробное число(тип double).
4. Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String s = bis.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bis.readLine());
        return i;
    }

    public static double readDouble() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double dbl = Double.parseDouble(bis.readLine());
        return dbl;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        boolean bln = Boolean.parseBoolean(bis.readLine());
        return bln;

    }

    public static void main(String[] args) {

    }
}

*/
}
