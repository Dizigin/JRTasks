package tasks_08;

public class task0815_Population_Census {
/*
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Сергей");
        map.put("Петров", "Петр");
        map.put("Самедов","Василий");
        map.put("Магомедов","Илья");
        map.put("Поздняков","Сеемен");
        map.put("Волков","Иван");
        map.put("Котов","Виктор");
        map.put("Викторов","Николай");
        map.put("Николаев","Алексей");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countTheSameFirstName = 0;
        for (Map.Entry<String, String> pair: map.entrySet()){
            if (name == pair.getValue()) countTheSameFirstName++ ;
        }
        return countTheSameFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countTheSameLastName = 0;
        for (Map.Entry<String, String> pair: map.entrySet()){
            if (lastName == pair.getKey()) countTheSameLastName++ ;
        }
        return countTheSameLastName;
    }

    public static void main(String[] args) {
        //System.out.println(getCountTheSameFirstName(createMap(),"Иван"));
        //System.out.println(getCountTheSameLastName(createMap(),"Поздняков"));
    }
}
*/
}
