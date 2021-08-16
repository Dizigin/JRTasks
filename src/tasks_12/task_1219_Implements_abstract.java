package tasks_12;

public class task_1219_Implements_abstract {
/*
Создаем человека
Есть public интерфейсы CanFly (летать), CanRun (бежать/ездить), CanSwim (плавать).
Добавь эти интерфейсы классам Human (человек), Duck (утка), Penguin (пингвин), Airplane (самолет), и не забудь про реализацию методов интерфейсов (в методах ничего делать не нужно).

Requirements:
1. Класс Solution должен содержать интерфейс CanFly с одним методом fly().
2. Класс Solution должен содержать интерфейс CanRun с одним методом run().
3. Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
4. Человек должен уметь бегать и плавать.
5. Утка должна уметь летать, плавать и бегать.
6. Пингвин должен уметь плавать и бегать.
7. Самолет должен уметь летать.

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public abstract class Human implements CanRun, CanSwim{
        public abstract void run();
        public abstract void swim();
    }

    public abstract class Duck implements CanFly, CanSwim, CanRun{
        public abstract void fly();
        public abstract void swim();
        public abstract void run();
    }

    public abstract class Penguin implements CanSwim, CanRun{
        public abstract void swim();
        public abstract void run();
    }

    public abstract class Airplane implements CanFly{
        public abstract void fly();
    }
}
 */
}
