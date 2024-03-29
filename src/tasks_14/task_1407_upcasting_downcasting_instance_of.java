package tasks_14;

public class task_1407_upcasting_downcasting_instance_of {
/*
Player and Dancer
Посмотри, что делает эта программа.
Затем измени haveFun так, чтобы он вызывал метод:
play(), если person имеет тип Player.
dance(), если person имеет тип Dancer.

Requirements:
1. Класс Player должен реализовывать интерфейс Person.
2. Класс Dancer должен реализовывать интерфейс Person.
3. Метод haveFun() должен вызывать метод play() у переданного ему объекта, если объект является игроком (Player).
4. Метод haveFun() должен вызывать метод dance() у переданного ему объекта, если объект является танцором (Dancer).
5. Метод main() должен считывать данные с клавиатуры.
6. Метод main() должен прекращать считывать данные с клавиатуры, если введенная строка равна "exit".

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        //напишите тут ваш код
        if (person instanceof Player) ((Player) person).play();
        if (person instanceof Dancer) ((Dancer) person).dance();
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
 */
}
