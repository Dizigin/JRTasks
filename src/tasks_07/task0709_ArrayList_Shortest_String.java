package tasks_07;

public class task0709_ArrayList_Shortest_String {
/*
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3. Программа должна выводить самую короткую строку на экран.
4. Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
        }
        int lenght = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < lenght){
                lenght = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() == lenght){
                System.out.println(list.get(i));
            }
        }
    }
}
*/
}
