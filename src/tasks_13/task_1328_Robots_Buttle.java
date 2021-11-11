package tasks_13;

public class task_1328_Robots_Buttle {
/*
Битва роботов
Для начала разберись в том, что делает код: это будет непросто.
Затем измени код согласно новой архитектуре и добавь новую логику:
Сделай класс AbstractRobot абстрактным, вынеси логику атаки и защиты из Robot в AbstractRobot.
Отредактируй класс Robot, учитывая AbstractRobot.
Расширь класс BodyPart новой частью тела BodyPart.CHEST("грудь").
Добавь новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).

Requirements:
1. Класс AbstractRobot должен быть абстрактным.
2. Класс AbstractRobot должен реализовывать интерфейсы Attackable и Defensable.
3. Класс Robot должен наследоваться от класса AbstractRobot.
4. Логика поведения роботов должна быть вынесена в класс AbstractRobot.
5. В классе BodyPart должна содержаться и быть инициализирована final static переменная CHEST типа BodyPart.
6. Новую часть тела (BodyPart) нужно добавить в логику методов attack и defense в классе AbstractRobot.

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }

    public class Robot extends AbstractRobot {

        public Robot(String name) {
            super(name);
        }

    }

    public interface Attackable {
        BodyPart attack();
    }

    public interface Defensable {
        BodyPart defense();
    }

    public abstract class AbstractRobot implements Attackable, Defensable{
        private static int hitCount;
        private String name;

        public AbstractRobot(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public BodyPart attack() {
            BodyPart attackedBodyPart = null;
            hitCount = hitCount + 1;

            if (hitCount == 1) {
                attackedBodyPart = BodyPart.ARM;
            } else if (hitCount == 2) {
                attackedBodyPart = BodyPart.HEAD;
            } else if (hitCount == 3) {
                attackedBodyPart = BodyPart.LEG;
            } else {
                hitCount = 0;
                attackedBodyPart = BodyPart.CHEST;
            }
            return attackedBodyPart;
        }

        public BodyPart defense() {
            BodyPart defendedBodyPart = null;
            hitCount = hitCount + 2;

            if (hitCount == 1) {
                defendedBodyPart = BodyPart.HEAD;
            } else if (hitCount == 2) {
                defendedBodyPart = BodyPart.LEG;
            } else if (hitCount == 3) {
                defendedBodyPart = BodyPart.ARM;
            } else {
                hitCount = 0;
                defendedBodyPart = BodyPart.CHEST;
            }
            return defendedBodyPart;
        }

    }

    public final class BodyPart {
        final static BodyPart LEG = new BodyPart("нога");
        final static BodyPart HEAD = new BodyPart("голова");
        final static BodyPart ARM = new BodyPart("рука");
        final static BodyPart CHEST = new BodyPart("Грудь");

        private String bodyPart;

        private BodyPart(String bodyPart) {
            this.bodyPart = bodyPart;
        }

        @Override
        public String toString() {
            return this.bodyPart;
        }
    }


}
 */

}
