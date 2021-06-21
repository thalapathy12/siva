package com.example.siva.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookdetails")
public class DemoEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String authorname;
    private int pages;

    public DemoEntity(String name, String authorname, int pages) {
        this.name = name;
        this.authorname = authorname;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
