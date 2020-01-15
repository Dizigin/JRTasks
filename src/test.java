import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList integerList = new ArrayList();
        for (int i = 0; i < n; i++){
            integerList.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(integerList);
    }

}