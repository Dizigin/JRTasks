package tasks_09;

public class task0929_Copy_File_2 {
/*
    Обогатим код функциональностью!
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то программа должна вывести надпись "Файл не существует." и еще один раз прочитать имя файла с консоли, а уже потом считывать файл для записи.

Требования:
1. Программа должна считывать имена файлов.
2. Метод main должен обрабатывать исключения кидаемые методом getInputStream. Если возникло исключение, нужно вывести сообщение «Файл не существует.».
3. Программа должна копировать содержимое первого файла во второй.
4. В методе main должен вызываться метод getInputStream.
5. Метод getInputStream изменять нельзя.
6. В методе main должен вызываться метод getOutputStream.
7. Метод getOutputStream изменять нельзя.

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        InputStream fileInputStream;
        try{
            fileInputStream = getInputStream(sourceFileName);
        }
        catch (FileNotFoundException fe){
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
        }
        fileInputStream = getInputStream(sourceFileName);
        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

*/
}
