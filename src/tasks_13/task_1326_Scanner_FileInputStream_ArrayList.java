package tasks_13;

public class task_1326_Scanner_FileInputStream_ArrayList {
/*
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10

Requirements:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла — FileInputStream.

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
             Scanner fileScanner = new Scanner(fileInputStream)) {

            ArrayList<Integer> data = new ArrayList<>();

            while (fileScanner.hasNextInt()) {
                int value = fileScanner.nextInt();
                if (value % 2 == 0) data.add(value);
            }

            Collections.sort(data);
            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 */
}
