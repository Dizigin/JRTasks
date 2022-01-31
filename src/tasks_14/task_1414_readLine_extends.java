package tasks_14;

public class task_1414_readLine_extends {
/*
MovieFactory
У нас есть кинофабрика, но она работает не в полную силу.
Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
Вот что тебе нужно сделать для успешного решения:
Разобраться, что программа умеет делать.
Все классы должны быть внутри класса Solution.
Добавить классы Cartoon, Thriller.
Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
Аналогично получению объекта SoapOpera сделать:
добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
Считать с консоли несколько ключей (строк).
Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".

Создать переменную movie типа Movie и для каждой введенной строки (ключа):
получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
вывести на экран movie.getClass().getSimpleName().

Requirements:
1. Классы Cartoon и Thriller должны быть статическими и существовать внутри класса Solution.
2. Метод MovieFactory.getMovie должен возвращать объект типа Cartoon при передаче ему строки "cartoon" в качестве параметра.
3. Метод MovieFactory.getMovie должен возвращать объект типа Thriller при передаче ему строки "thriller" в качестве параметра.
4. Метод main должен считывать строки с клавиатуры.
5. Метод main должен прекращать считывать строки с клавиатуры, если была введена некорректная строка (не "cartoon", не "thriller" или не "soapOpera").
6. Для каждой введенной строки (в том числе для некорректной) необходимо вызвать метод MovieFactory.getMovie().
7. Для всех введенных корректных строк необходимо вывести на экран простые имена (movie.getClass().getSimpleName()) типов объектов, возвращаемых методом MovieFactory.getMovie().

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = "";
        Movie movie;
        while (true) {
            key = reader.readLine();
            if (key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera")) {
                movie = MovieFactory.getMovie(key);
            } else {
                movie = MovieFactory.getMovie(key);
                break;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
}

static class MovieFactory {

    static Movie getMovie(String key) {
        Movie movie = null;

        //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
        if ("soapOpera".equals(key)) {
            movie = new SoapOpera();
        }
        //напишите тут ваш код, пункты 5,6
        if ("cartoon".equals(key)) {
            movie = new Cartoon();
        }
        if ("thriller".equals(key)) {
            movie = new Thriller();
        }
        return movie;
    }
}

static abstract class Movie {
}

static class SoapOpera extends Movie {
}

//Напишите тут ваши классы, пункт 3
static class Cartoon extends Movie {
}

static class Thriller extends Movie {
}

}
 */
}
