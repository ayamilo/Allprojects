package personalpractice;
import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(50);
        list.add(90);
        System.out.println("list = " + list);
        list.remove(1);
        System.out.println("list = " + list);
        list.add(2,10);
        System.out.println("list = " + list);
        list.size();
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("Sort list  = " + list);
        list.set(2,30);
        System.out.println("list = " + list);
        list.isEmpty();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains(10));
        list.indexOf(30);
        System.out.println(list.lastIndexOf(list));

    }
}
