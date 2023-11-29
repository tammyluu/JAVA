package org.example.book_arrayList.classes;

public class PaperBook extends  Book{
    private int nPage;
    private  String publishing;


    public PaperBook(String title, String author, int nPage, String publishing) {
        super(title, author);
        this.nPage = nPage;
        this.publishing = publishing;
    }



    @Override
    public String toString() {
       // String strParents = super.toString;
        return  super.toString()+ "PaperBook : " +
                "nPage=" + nPage +
                ", publishing='" + publishing + '\'' +
                '.';
    }
}
