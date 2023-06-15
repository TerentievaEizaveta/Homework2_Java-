/*1) Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", 
"city":"Moscow", "age":"null"}
Пример вывода: "select * from students WHERE name = Ivanov AND 
country = Russia.....".

2) Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл.

Дополнительные задания

3) Дана json-строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, 
создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.

4) К калькулятору из предыдущего ДЗ добавить логирование./
*/
/*
import java.io.*;
import java.util.regex.Pattern;
public class homework2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String s;
        while((s=br.readLine())!=null){     
            System.out.println(s);
            s=s.replaceAll("\"", ""); 
            //System.out.println(s);
            StringBuilder result = new StringBuilder("");
            Pattern pattern = Pattern.compile("[{},]");
            String[] words = pattern.split(s);
            
            for(String word:words){
                if (word.endsWith("null")==false)
                {
                    word=word.replaceAll(":", "=");
                    if(result.toString().length() > 1) {
                        result.append(" AND ");
                    }
                    result.append(word);
                }
            
            }
            System.out.print("select * from students WHERE " + result); 
        }             
    }
}

*/
/*
import java.io.*;
import java.util.Arrays;
public class homework2 {   
    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("task2.txt", false);

        int [] arr =new int [10];

        for(int i = 0; i <  arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        writer.write(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] =arr[j + 1];
                    arr[j + 1] = swap;
                }
                writer.append("\r\n");
                writer.append(Arrays.toString(arr));   
            }
            writer.flush();
        }
        for(int in = 0; in < arr.length; in++){
        System.out.print(arr[in] + " " );
        writer.close();
        }
    }
}
*/