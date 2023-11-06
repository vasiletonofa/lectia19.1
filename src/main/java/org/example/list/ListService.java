package org.example.list;
import java.util.*;

public class ListService {

    public void modifyList(List<String> list) { // 321 - Pass by reference
//        list = new ArrayList<>(); // 674
        list.add("A"); // 321 - A
    }

    public void modify(int a) { // Pass by value - 4
        a = 3;
    }
}
