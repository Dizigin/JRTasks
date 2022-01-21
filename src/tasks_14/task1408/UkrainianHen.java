package tasks_14.task1408;

public class UkrainianHen extends Hen{
    int getCountOfEggsPerMonth() {
        return 8;
    }
    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
