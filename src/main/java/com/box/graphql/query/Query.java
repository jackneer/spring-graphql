package com.box.graphql.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;
import java.util.Optional;

import com.box.graphql.models.*;
import com.box.graphql.services.*;


@Component
public class Query implements GraphQLQueryResolver {    

    @Autowired
    private PersonService personService;

    @Autowired
    private ArticleService articleService;


    public List<Person> people() {
        return personService.getPeople();
    }

    public Optional<Person> person(int uuid) {
        return personService.getPersonById(uuid);
    }

    public Person person(Article article) {
        return article.getPerson();
    }

    public List<Article> articles() {
        return articleService.getArticles();
    }

    public List<Article> articles(Person person) {
        return person.getArticles();
    }

    public Optional<Article> article(int uuid) {
        return articleService.getArticleById(uuid);
    }
}