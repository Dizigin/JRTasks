import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test {
        public static Map<String, String> createMap() {
            //напишите тут ваш код
            Map<String, String> map = new HashMap<String, String>();
            map.put("Андреев","Сергей");
            map.put("Петров","Валерий");
            map.put("Сидоров","Иван");
            map.put("Котов","Валерий");
            map.put("Прохоренко","Семен");
            map.put("Заяц","Семен");
            map.put("Захаров","Сергей");
            map.put("Чубов","Семен");
            map.put("Бартоломеев","Семен");
            map.put("Слепаков","Максим");
            return map;
        }

        public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> pair1 = iterator1.next();
            String key1 = pair1.getKey();
            String value1 = pair1.getValue();
            Map<String, String> copy = new HashMap<>(map);
            Iterator<Map.Entry<String, String>> iterator2 = copy.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry<String, String> pair2 = iterator2.next();
                String key2 = pair2.getKey();
                String value2 = pair2.getValue();
                if (value1 == value2 && key1 != key2) {
                    //System.out.println("Удаляем " + key2 + " на основании " + key1);
                    Map<String, String> copyDel = new HashMap<>(map);
                    for (Map.Entry<String, String> pair : copyDel.entrySet()) {
                        //if (pair.getValue().equals(value)) {
                            map.remove(pair.getKey());
                        //}
                    }
                }
            }
            //System.out.println(key1 + " = " + value1);
        }
    }
    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}