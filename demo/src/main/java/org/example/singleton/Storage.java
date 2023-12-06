package org.example.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Storage {
    private  static volatile Storage instance = null;
    private static  Object lock = new Object();
    private List<Person> personList = new ArrayList<>();
    public List<Person> getPersonList(){
        return personList;
    }
    private Storage(){
        personList = new ArrayList<>();
    }
    public static Storage getInstance(){
        if (instance == null) {
            synchronized (Storage.class){
                instance = new Storage();
            }
        }
        return  instance;
    }

}
