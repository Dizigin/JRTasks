package tasks_14.task1408;

public class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 10;
    }
    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
