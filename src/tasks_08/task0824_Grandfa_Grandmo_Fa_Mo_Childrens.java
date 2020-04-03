package tasks_08;

public class task0824_Grandfa_Grandmo_Fa_Mo_Childrens {
/*
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human children1 = new Human("Вася",true,12);
        Human children2 = new Human("Игорь",true,15);
        Human children3 = new Human("Настя", false,10);
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(children1);
        children.add(children2);
        children.add(children3);
        Human parent1 = new Human("Николай",true,39, children);
        Human parent2 = new Human("Светлана",false,36,children);
        ArrayList<Human> parents1 = new ArrayList<Human>();
        parents1.add(parent1);
        ArrayList<Human> parents2 = new ArrayList<Human>();
        parents2.add(parent2);
        Human grandfa1 = new Human("Валерий",true,68, parents1);
        Human grandmo1 = new Human("София",false,63, parents1);
        Human grandfa2 = new Human("Мирослав",true,70,parents2);
        Human grandmo2 = new Human("Мария",false,67,parents2);
        System.out.println(grandfa1.toString());
        System.out.println(grandmo1.toString());
        System.out.println(grandfa2.toString());
        System.out.println(grandmo2.toString());
        System.out.println(parent1.toString());
        System.out.println(parent2.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

*/
}
