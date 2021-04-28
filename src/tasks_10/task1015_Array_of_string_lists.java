package tasks_10;

public class task1015_Array_of_string_lists {
/*
Массив списков строк
Создай массив, элементами которого будут списки строк.
Заполни массив любыми данными и выведи их на экран.

Требования:
1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4. Программа должна выводить данные на экран.
5. Метод main должен вызывать метод createList.
6. Метод main должен вызывать метод printList.

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayOfArrayLists = new ArrayList[5];
        arrayOfArrayLists[0] = new ArrayList<String>();
        arrayOfArrayLists[0].add("Черный");
        arrayOfArrayLists[1] = new ArrayList<String>();
        arrayOfArrayLists[1].add("Белый");
        arrayOfArrayLists[2] = new ArrayList<String>();
        arrayOfArrayLists[2].add("Фиолетовый");
        arrayOfArrayLists[3] = new ArrayList<String>();
        arrayOfArrayLists[3].add("Оранжевый");
        arrayOfArrayLists[4] = new ArrayList<String>();
        arrayOfArrayLists[4].add("Розовый");
        //return null;
        return arrayOfArrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
 */
}
