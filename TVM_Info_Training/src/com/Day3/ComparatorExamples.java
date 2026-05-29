package com.Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stud {

    int id;
    String name;

    Stud(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}


public class ComparatorExamples {

	public static void main(String[] args) {
		

        List<Stud> list = new ArrayList<>();

        list.add(new Stud(3, "Ram"));
        list.add(new Stud(1, "Amit"));
        list.add(new Stud(2, "John"));

        Comparator<Stud> comp =
                Comparator.comparing((Stud s) -> s.name)
                          .thenComparing(s -> s.id);

        Collections.sort(list, comp);

        System.out.println(list);

	}

}
