package org.example.book_arrayList;

public class PaperBook extends  Book{
    private int nPage;
    private  String publishing;

    public PaperBook(int id, String title, int nPage, String publishing) {
        super(id, title);
        this.nPage = nPage;
        this.publishing = publishing;
    }

    public int getnPage() {
        return nPage;
    }

    public void setnPage(int nPage) {
        this.nPage = nPage;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    @Override
    public String toString() {
        return "PaperBook: " +
                "nPage=" + nPage +
                ", publishing='" + publishing + '\'' +
                '.';
    }
}
