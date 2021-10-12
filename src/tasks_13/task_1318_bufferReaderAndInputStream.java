package tasks_13;

public class task_1318_bufferReaderAndInputStream {
/*
Чтение файла
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

Requirements:
1. Программа должна считывать c консоли путь к файлу.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferReader.readLine();
        InputStream inStream = new FileInputStream(s);
        while (inStream.available() > 0)
        {
            System.out.print((char)inStream.read());
        }
        inStream.close();
        bufferReader.close();
    }
}
 */
}
