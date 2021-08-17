package tasks_12;

public class task_1226_interface_implements_abstract_class {
/*
Лазать, летать и бегать
Вот что тебе нужно сделать в этой задаче:
Внутри класса Solution создай интерфейс public interface CanFly (летать) с методом void fly().
Внутри класса Solution создай интерфейс public interface CanClimb (лазить по деревьям) с методом void climb().
Внутри класса Solution создай интерфейс public interface CanRun (бегать) с методом void run().
Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
Добавь интерфейсы классам Cat (кот), Dog (собака), Tiger (тигр), Duck (Утка).

Requirements:
1. Класс Solution должен содержать интерфейс CanFly с методом void fly().
2. Класс Solution должен содержать интерфейс CanClimb с методом void climb().
3. Класс Solution должен содержать интерфейс CanRun с методом void run().
4. Объект класса Cat должен уметь бегать (поддерживать интерфейс CanRun) и лазить по деревьям (поддерживать интерфейс CanClimb).
5. Объект класса Dog должен уметь бегать (поддерживать интерфейс CanRun).
6. Класс Tiger должен быть котом.
7. Объект класса Duck должен уметь бегать (поддерживать интерфейс CanRun) и летать (поддерживать интерфейс CanFly).

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanFly{
       public void fly();
    }

    public interface CanClimb{
      public void climb();
    }

    public interface CanRun{
      public void run();
    }

    public class Cat implements CanClimb, CanRun{
       public void climb(){}
       public void run(){}
    }

    public abstract class Dog implements CanRun{
    }

    public class Tiger extends Cat {
    }

    public abstract class Duck implements CanRun, CanFly{
        public void run(){}
        public void fly(){}
    }
}
 */
}
