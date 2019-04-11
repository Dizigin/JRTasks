package tasks_07;

public class task0712_Longest_Or_Shortest {
/*
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        // Определяем индекс самой длинной строки
        int lenghtStr = 0;
        int indLong = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > lenghtStr){
                lenghtStr = list.get(i).length();
                indLong = i;
            }
        }
        //System.out.println(indLong); // Выводим индекс самой длинной строки
        //Определяем индекс самой короткой строки
        int lenghtShort = list.get(0).length();
        int indShort = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < lenghtShort){
                lenghtShort = list.get(i).length();
                indShort = i;
            }
        }
        //System.out.println(indShort); // Выводим индекс самой короткой строки;
        if (indLong >= indShort)
            System.out.println(list.get(indShort));
        else System.out.println(list.get(indLong));

    }
}
*/
}
