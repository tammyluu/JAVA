package org.example.book_arrayList.classes;

public class Ebook extends Book {
    private String format;
    private Long sizeOctets;

    public Ebook(String title, String author, String format, Long sizeOctets) {
        super(title, author);
        this.format = format;
        this.sizeOctets = sizeOctets;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Long getSizeOctets() {
        return sizeOctets;
    }

    public void setSizeOctets(Long sizeOctets) {
        this.sizeOctets = sizeOctets;
    }

    @Override
    public String toString() {
        return  super.toString() + "Ebook: " +
                "type of File='" + format + '\'' +
                ", size =" + sizeOctets + "in octets" ;

    }
}
