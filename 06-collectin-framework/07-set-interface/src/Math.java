import java.util.LinkedHashSet;

public class Math {
    public static void main(String[] args) {
        var set1 = new LinkedHashSet<String>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        var set2 = new LinkedHashSet<String>();
        set1.add("A");
        set2.add("B");
        set2.add("E");
        set2.add("G");

//        set1.removeAll(set2);
        set1.retainAll(set2);
        set1.forEach(System.out::println);
    }
}
