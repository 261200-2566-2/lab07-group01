import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        //Implement initial hashmap
        System.out.println("----------------Create String Hashset Object--------------- ");
        HashSet<String,Boolean> map = new HashSet<>();
        System.out.println("----------------Add String to Hashset Object--------------- ");
        map.add("Apple");
        map.add("Pineapple");
        map.add("Orange");
        map.printElement();
        System.out.println("-------------------Test size method------------------------ ");
        System.out.println("Size : "+map.size());
        System.out.println("-----------------Test contains method---------------------- ");
        System.out.println("Contains `Banana` : "+map.contains("Banana"));
        System.out.println("Contains `Apple` : "+map.contains("Apple"));

        System.out.println("------------------Test remove method----------------------- ");
        map.remove("Apple");
        System.out.println("Map size after removing `Apple` : "+map.size());

        System.out.println("---------------Test printElement method-------------------- ");
        map.printElement();

        System.out.println("------------------Test clear method------------------------ ");
        map.clear();
        map.printElement();

        System.out.println("--------------Create Integer Hashset Object---------------- ");
        HashSet <Integer,Boolean> map2 = new HashSet<>();
        System.out.println("--------------Add Integer to Hashset Object---------------- ");
        map2.add(1);
        map2.add(2);
        map2.add(3);
        map2.printElement();

        System.out.println("-------------------Test size method------------------------ ");
        System.out.println("Size before Clear: "+map2.size());
        System.out.println("-----------------Test contains method---------------------- ");
        System.out.println("Contains `1` : "+map2.contains(1));
        System.out.println("Contains `1` : "+map2.contains(2));
        map2.printElement();
        System.out.println("-------------------Test clear method----------------------- ");
        map2.clear();
        System.out.println("Size after Clear: "+map2.size());
        map2.printElement();

        System.out.println("-------------------Test addAll method----------------------- ");
        HashSet<String,Boolean> map3 = new HashSet<>();
        Collection<String> map4 = Arrays.asList("One","Two");
        map3.add("A");
        map3.add("B");
        map3.add("C");
        map3.addAll(map4);
        map3.printElement();

        System.out.println("----------------Test ContainsAll method--------------------- ");
        System.out.println("Map3 contains all elements in map4: "+map3.containsAll(map4));

        System.out.println("----------------Test RetainsAll method--------------------- ");
        System.out.println("Map3 retains all elements in map4: "+map3.retainAll(map4));
        map3.printElement();

        System.out.println("----------------Test RemoveAll method---------------------- ");
        System.out.println("Map3 remove all elements in map4: "+map3.removeAll(map4));
        map3.printElement();

    }
}