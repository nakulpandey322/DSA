
import java.util.HashSet;
import java.util.Scanner;
public class Hashing2{
    public static void main(String[] args){
        HashSet<String> fruits= new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        System.out.println(fruits);
        System.out.println(fruits.contains("Mango"));
        fruits.remove("Banana");
        System.out.println(fruits);
    }
}
