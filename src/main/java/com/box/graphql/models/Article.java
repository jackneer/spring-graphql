package com.box.graphql.models;

import javax.persistence.*;


@Entity
@Table(name = "article")
public class Article {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uuid;

    @Column(length = 50)
    private String title;

    @Column(length = 50)
    private String content;

    @ManyToOne
    @JoinColumn(name="person_id", referencedColumnName="uuid")
    private Person person;
    
    public Article() {}
    
    public int getUuid() { return uuid; }
    public void setUuid(int uuid) { this.uuid = uuid; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }
}