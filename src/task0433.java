/*Пример вывода на экран:
        SSSSSSSSSS
        SSSSSSSSSS
        SSSSSSSSSS
        SSSSSSSSSS
        SSSSSSSSSS
        SSSSSSSSSS
        SSSSSSSSSS
        SSSSSSSSSS
        SSSSSSSSSS
        SSSSSSSSSS
        Требования:
        1. Программа не должна считывать текст c клавиатуры.
        2. Программа должна выводить текст на экран.
        3. Программа должна выводить квадрат из 10х10 букв S.
        4. В программе должен использоваться цикл while.*/
public class task0433 {
    public static void main(String[] args) throws Exception {
        int i = 10;
        while (i > 0) {
            int j = 9;
            while (j > 0) {
                System.out.print("S");
                j--;
            }
            System.out.println("S");
            i--;
        }
    }
}
