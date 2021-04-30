package tasks_10;

public class task1019_HashMap_Input_Output_Key_ana_Value {
/*
Функциональности маловато!
Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.

Ключевые требования:
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран.
Каждую пару - с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
4. Программа должна помещать в HashMap пары считанные с клавиатуры.
5. Программа должна выводить на экран содержимое HashMap согласно условию. Ключ и значение разделены пробелом. Каждое значение с новой строки.

public class Solution {

    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        Integer index;
        String name;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                index = Integer.parseInt(reader.readLine());
                name = reader.readLine();
                map.put(name, index);
            }
        }
        catch (Exception e) {
            for (Map.Entry<String, Integer> pair : map.entrySet()) {
                index = pair.getValue();
                name = pair.getKey();
                System.out.println(index + " " + name);
            }
        }
    }
}
 */

}
