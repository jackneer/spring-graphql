package com.box.graphql.models;

import java.util.*; 
import javax.persistence.*;


@Entity
@Table(name = "person")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uuid;

    @Column(length = 50)
    private String name;

    private int age;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "person", cascade = CascadeType.ALL)
    private List<Article> articles;

    public Person() {}

    public Person(int id) {
        this.uuid = id;
    }
    
    public int getUuid() { return uuid; }
    public void setUuid(int uuid) { this.uuid = uuid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public List<Article> getArticles() { return articles; }
    public void setArticles(List<Article> articles) { this.articles = articles; }
}