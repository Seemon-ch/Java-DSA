package arrayList;


import java.util.*;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.set(1, 25);

        System.out.println(list);
    }
}
