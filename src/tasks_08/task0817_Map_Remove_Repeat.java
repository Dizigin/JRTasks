package tasks_08;

public class task0817_Map_Remove_Repeat {
/*
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов","Сергей");
        map.put("Петров","Валерий");
        map.put("Сидоров","Иван");
        map.put("Котов","Валерий");
        map.put("Прохоренко","Семен");
        map.put("Заяц","Семен");
        map.put("Захаров","Эльдар");
        map.put("Чубов","Семен");
        map.put("Бартоломеев","Семен");
        map.put("Слепаков","Максим");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy1 = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> iterator1 = copy1.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> pair1 = iterator1.next();
            String key1 = pair1.getKey();
            String value1 = pair1.getValue();
            Map<String, String> copy2 = new HashMap<>(map);
            Iterator<Map.Entry<String, String>> iterator2 = copy2.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry<String, String> pair2 = iterator2.next();
                String key2 = pair2.getKey();
                String value2 = pair2.getValue();
                if (value2 == value1 && key2 != key1) {
                    removeItemFromMapByValue(map,value2);
                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
        //System.out.println(map);
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
*/
}
