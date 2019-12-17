package tasks_08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task0818_Map_Remove_500 {
/*
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Иванов",100);
        map.put("Петров",200);
        map.put("Сидоров",300);
        map.put("Котов",400);
        map.put("Прохоренко",500);
        map.put("Заяц",600);
        map.put("Захаров",700);
        map.put("Чубов",800);
        map.put("Бартоломеев",900);
        map.put("Слепаков",1000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
    //напишите тут ваш код
    Map<String, Integer> copy = new HashMap<String, Integer>(map);
    Iterator<Map.Entry<String, Integer>> iterator = copy.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<String, Integer> pair = iterator.next();
        String key = pair.getKey();
        Integer value = pair.getValue();
        if (value < 500) map.remove(key);
    }
    //return map;
}

    public static void main(String[] args) {
        //System.out.println(removeItemFromMap(createMap()));
    }
}
*/
}
