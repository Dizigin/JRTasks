package tasks_14.task1408;

public class MoldovanHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 6;
    }
    @Override
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
