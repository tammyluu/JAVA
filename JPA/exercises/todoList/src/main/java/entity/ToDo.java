package entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "Task")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String title;
   private boolean complexity;

    public ToDo() {
    }

    public ToDo(String title, boolean complexity) {
        this.title = title;
        this.complexity = complexity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public boolean iscomplexity() {
        return complexity;
    }

    public void setcomplexity(boolean complexity) {
        this.complexity = complexity;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", complexity=" + complexity +
                '}';
    }
    public void showTasks(){
        System.out.printf("|%5d|%25s|%15s|", id, title,complexity);
    }
}
