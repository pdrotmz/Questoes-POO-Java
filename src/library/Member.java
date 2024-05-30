package library;

import java.util.List;

public class Member {
    private int id;
    private String name;
    private List<Book> livrosEmprestados;


    public Member(int id, String name, List<Book> livrosEmprestados) {
        this.id = id;
        this.name = name;
        this.livrosEmprestados = livrosEmprestados;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public List<Book> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    
}
