import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        while (n-- > 0) {
            String name = sc.next();

            if (!map.containsKey(name)) {
                map.put(name, 1);
                System.out.println("OK");
            } else {
                int num = map.get(name);

                String newName = name + num;

                while (map.containsKey(newName)) {
                    num++;
                    newName = name + num;
                }

                map.put(name, num + 1);
                map.put(newName, 1);

                System.out.println(newName);
            }
        }
    }
}