import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        StringBuilder out = new StringBuilder();

        while (n-- > 0) {
            String name = br.readLine();

            if (!map.containsKey(name)) {
                map.put(name, 1);
                out.append("OK\n");
            } else {
                int num = map.get(name);

                String newName = name + num;

                while (map.containsKey(newName)) {
                    num++;
                    newName = name + num;
                }

                map.put(name, num + 1);
                map.put(newName, 1);

                out.append(newName).append('\n');
            }
        }

        System.out.print(out);
    }
}