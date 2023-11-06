package org.example;
import org.example.list.ListService;
import org.example.person.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<String> list2 = new ArrayList<>(); // 321
//
//        ListService listService = new ListService();
//        listService.modifyList(list2);
//
//        System.out.println(list2); // 321 - A
//
//        int b = 4;
//        listService.modify(b);
//        System.out.println(b); // 4

//
//        Person ion = new Person(); // 654                        // Person { name = "Vasile", age = 30} - 489
//                                                                 // Person v1 = 489
//                                                                 // Person v2 = v1 ->  489
//                                                                 // v2.setAge(30)
//
//        Person vasile = new Person(); // 489
//
//        ion.setAge(20); // 654
//        ion.setName("Ion"); // 654
//
//        vasile.setName("Vasile"); // 489
//        vasile.setAge(28); // 489
//
////        System.out.println(ion);
////        System.out.println(vasile);
//
//        ion = vasile; // 489 -> // 654 - elegibila pentru colectare de garbage collector
//        ion.setAge(30);
//
//        System.out.println(vasile); // Vasile. 30
//        System.out.println(ion); //  Vasile. 30

        Person person = new Person(); // 543
        person.setAge(20);
        person.setName("Ion");
        person.setIdnp(124345476);

        Person person1 = new Person(); // 784
        person1.setName("Ion");
        person1.setAge(34);
        person1.setIdnp(124345476);

        Set<Person> people = new HashSet<>();
        people.add(person); // 543
        people.add(person1); // 784 == 543 ? NO

        System.out.println(people);

        boolean a = person.equals(person1);
        boolean b = person == person1;

        System.out.println(a); // true
        System.out.println(b); // false
    }
}