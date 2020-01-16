package tasks_08;

public class task0828_Map_Month_Number {
/*
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String textMonth = reader.readLine();
        //System.out.println(textMonth + " is the___month");
        Map<Integer, String> monthMap = new HashMap<Integer, String>();
        monthMap.put(1,"January");
        monthMap.put(2,"February");
        monthMap.put(3,"March");
        monthMap.put(4,"April");
        monthMap.put(5,"May");
        monthMap.put(6,"June");
        monthMap.put(7,"July");
        monthMap.put(8,"August");
        monthMap.put(9,"September");
        monthMap.put(10,"October");
        monthMap.put(11,"November");
        monthMap.put(12,"December");
        Iterator<Map.Entry<Integer, String>> iterator = monthMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> pair = iterator.next();
            if (pair.getValue().equals(textMonth)){
                System.out.println(textMonth + " is the " + pair.getKey()+ " month");
            }
        }
    }
}
*/
}
