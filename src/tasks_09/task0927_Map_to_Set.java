package tasks_09;

public class task0927_Map_to_Set {
/*
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен создавать новый объект HashMap<String, Cat>.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("Васька", new Cat("Васька"));
        map.put("Васька1", new Cat("Васька1"));
        map.put("Васька2", new Cat("Васька2"));
        map.put("Васька3", new Cat("Васька3"));
        map.put("Васька4", new Cat("Васька4"));
        map.put("Васька5", new Cat("Васька5"));
        map.put("Васька6", new Cat("Васька6"));
        map.put("Васька7", new Cat("Васька7"));
        map.put("Васька8", new Cat("Васька8"));
        map.put("Васька9", new Cat("Васька9"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>();
        cats.addAll(map.values());
        return  cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
*/
}
