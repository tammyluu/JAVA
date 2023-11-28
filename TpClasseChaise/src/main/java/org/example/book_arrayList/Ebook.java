package org.example.book_arrayList;

public class Ebook extends Book {
    private String typeFile;
    private double tailleOctets;

    public Ebook(int id, String title, String typeFile, double tailleOctets) {
        super(id, title);
        this.typeFile = typeFile;
        this.tailleOctets = tailleOctets;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public double getTailleOctets() {
        return tailleOctets;
    }

    public void setTailleOctets(double tailleOctets) {
        this.tailleOctets = tailleOctets;
    }

    @Override
    public String toString() {
        return "Ebook: " +
                "typeFile='" + typeFile + '\'' +
                ", tailleOctets=" + tailleOctets +
                '.';
    }
}
