package arrayList;


import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int key = 30;

        if (list.contains(key)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
