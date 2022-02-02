package tasks_14;

import java.util.Collections;

public class task_1420_greatest_common_divisor {
/*
НОД
Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.

Requirements:
1. Программа должна считывать с клавиатуры 2 строки.
2. Программа должна выводить данные на экран.
3. Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        //System.out.println("Введи с клавиатуры 2 целых положительных числа");
        for (int i = 0; i < 2; i++) {
            try
            {
                arrayList.add(Integer.parseInt(bufferedReader.readLine()));
            }
            catch (Exception e) {
                System.out.println("Введи 2 целых положительных числа!");
            }
        }
        int arrayMin = Collections.min(arrayList);
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        ArrayList<Integer> secondArrayList = new ArrayList<>();
        for (int i = arrayMin; i > 0; i--) {
            if ((arrayList.get(0) % i) == 0) {
                firstArrayList.add(i);
            }
            if ((arrayList.get(1) % i) == 0) {
                secondArrayList.add(i);
            }
        }
        ArrayList<Integer> СommonDivisor = new ArrayList<>();
        if (firstArrayList.size() >= secondArrayList.size()) {
            for (int i = 0; i < secondArrayList.size(); i++) {
                for (int j = 0; j < firstArrayList.size(); j++) {
                    if (secondArrayList.get(i) == firstArrayList.get(j)) {
                        СommonDivisor.add(secondArrayList.get(i));
                    }
                }
            }
        }
        else {
                for (int i = 0; i < firstArrayList.size(); i++) {
                    for (int j = 0; j < secondArrayList.size(); j++) {
                        if (firstArrayList.get(i) == secondArrayList.get(j)) {
                            СommonDivisor.add(firstArrayList.get(i));
                        }
                    }
                }
        }

        System.out.println(Collections.max(СommonDivisor));
}
}

 */

}
