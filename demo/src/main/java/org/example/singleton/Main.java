package org.example.singleton;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = Storage.getInstance().getPersonList();

    }
}
