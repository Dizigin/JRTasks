package tasks_10;

public class task1016_HashMapAndArrayList_Count_identical_values {
/*
Одинаковые слова в списке
Введи с клавиатуры 20 слов в список. Посчитай, сколько раз каждое из них встречается в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово, а второй - число раз, сколько раз данное слово встречалось в списке.

Выведи содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.

Требования:
1. Метод countWords должен объявлять и инициализировать HashMap с типом элементов <String, Integer>.
2. Метод countWords должен возвращать созданный словарь.
3. Метод countWords должен добавлять в словарь ключи, соответствующие уникальным словам, и значения по этим ключам, отображающие, сколько раз встречалось слово.
4. Программа должна выводить на экран полученный словарь.
5. Метод main должен вызывать метод countWords.

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        for (String element : list) {
            if (result.containsKey(element)) {
                result.put(element, result.get(element) + 1); // increase counter if contains
            } else
                result.put(element, 1);
        }
        return result;
    }
}
 */

}
