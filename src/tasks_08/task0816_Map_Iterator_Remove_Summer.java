package tasks_08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class task0816_Map_Iterator_Remove_Summer {
 /*
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.

Добрая Зинаида и летние каникулы

    public class Solution {
        public static Map<String, Date> createMap() throws ParseException {
            DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
            Map<String, Date> map = new HashMap<>();
            map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

            //напишите тут ваш код
            map.put("Иванов", dateFormat.parse("May 30 1999"));
            map.put("Петров", dateFormat.parse("June 15 2001"));
            map.put("Сидоров", dateFormat.parse("July 2 1982"));
            map.put("Котов", dateFormat.parse("January 29 1995"));
            map.put("Субботин", dateFormat.parse("December 4 1976"));
            map.put("Кальмаров", dateFormat.parse("October 10 1988"));
            map.put("Штирлиц", dateFormat.parse("September 5 1997"));
            map.put("Кабанчи", dateFormat.parse("June 24 1987"));
            map.put("Вероломнов", dateFormat.parse("July 22 1981"));
            return map;
        }

        public static void removeAllSummerPeople(Map<String, Date> map) {
            //напишите тут ваш код
            Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Date> pair = iterator.next();
                Date valueDate = pair.getValue();        //значение
                if (valueDate.getMonth() > 4 && valueDate.getMonth() < 8) iterator.remove();
            }
            //return map;
        }

        public static void main(String[] args) throws ParseException {
            //System.out.println(removeAllSummerPeople(createMap()));
        }
    }
 */
}
