package tasks_09;

public class task0930_Sort_Number_And_Striing {
/*
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз

Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
4. Выведенные числа должны быть упорядочены по убыванию.
5. Метод main должен использовать метод sort.
6. Метод sort должен использовать метод isGreaterThan.
7. Метод sort должен использовать метод isNumber.

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
// напишите тут ваш код
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                //если следующий элемент для сравнения не число, то идем дальше по массиву
                for(int k = 1; k < array.length-j; k++) {
                    //сортировка чисел
                    if (isNumber(array[j]) && isNumber(array[j + k])) {
                        if (Integer.parseInt(array[j]) < Integer.parseInt(array[j + k])) {
                            String tmp = array[j];
                            array[j] = array[j + k];
                            array[j + k] = tmp;
                        }
                    }
                    else {
                        //сортировка строк
                        if(!isNumber(array[j]) && !isNumber(array[j + k])){
                            if (isGreaterThan(array[j].toLowerCase(), array[j + k].toLowerCase())) {
                                String tmp = array[j];
                                array[j] = array[j + k];
                                array[j + k] = tmp;
                            }
                        }
                    }
                }
            }
        }// напишите тут ваш код
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                //если следующий элемент для сравнения не число, то идем дальше по массиву
                for(int k = 1; k < array.length-j; k++) {
                    //сортировка чисел
                    if (isNumber(array[j]) && isNumber(array[j + k])) {
                        if (Integer.parseInt(array[j]) < Integer.parseInt(array[j + k])) {
                            String tmp = array[j];
                            array[j] = array[j + k];
                            array[j + k] = tmp;
                        }
                    }
                    else {
                        //сортировка строк
                        if(!isNumber(array[j]) && !isNumber(array[j + k])){
                            if (isGreaterThan(array[j], array[j + k])) {
                                String tmp = array[j];
                                array[j] = array[j + k];
                                array[j + k] = tmp;
                            }
                        }
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
 */
}
