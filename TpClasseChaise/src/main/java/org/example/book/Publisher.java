package org.example.book;

public class Publisher {
    //public static int count = 0;
    int id;
    String chainOfPublisherName;

    public Publisher() {

        //this.id = ++count;
    }

    public Publisher(String chainOfPublisherName) {
        this.chainOfPublisherName = chainOfPublisherName;
    }

    public Publisher(int id, String chainOfPublisherName) {
        this.id = id;
        this.chainOfPublisherName = chainOfPublisherName;
    }

    public String getChainOfPublisherName() {
        return chainOfPublisherName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", chainOfPublisherName='" + chainOfPublisherName + '\'' +
                '}';
    }



}
