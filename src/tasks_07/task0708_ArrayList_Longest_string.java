package tasks_07;

public class task0708_ArrayList_Longest_string {
/*
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
1. Инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int lenght = 0;
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }
        for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).length() > lenght){
                    lenght = strings.get(i).length();
                }
        }
        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() == lenght){
                System.out.println(strings.get(i));
            }
        }
    }
}
*/
}
