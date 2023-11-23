package org.example.book;

public class Publisher {
    public static int count = 0;
    protected int id;
    protected String chainOfPublisherName;

    public Publisher() {
        this.id = ++count;
    }

    public Publisher(int id, String chainOfPublisherName) {
        this.id = id;
        this.chainOfPublisherName = chainOfPublisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", chainOfPublisherName='" + chainOfPublisherName + '\'' +
                '}';
    }
}
