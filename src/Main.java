import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Implement initial hashmap
        HashMap<String> map = new HashMap<>();
        map.add("Apple");
        map.add("Pineapple");
        map.add("Orange");

        System.out.println("Size : "+map.size());
        System.out.println("Contains `Banana` : "+map.contains("Banana"));
        System.out.println("Contains `Apple` : "+map.contains("Apple"));

        map.remove("Apple");

        System.out.println("Map size after removing `Apple` : "+map.size());

        map.printElement();
        map.clear();
        map.printElement();

        HashMap <Integer> map2 = new HashMap<>();
        map2.add(1);
        map2.add(2);
        map2.add(3);

        System.out.println("Size before Clear: "+map2.size());
        System.out.println("Map element : ");
        map2.printElement();
        map2.clear();
        System.out.println("Size after Clear: "+map2.size());
        map2.printElement();
    }
}