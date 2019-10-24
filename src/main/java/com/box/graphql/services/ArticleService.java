package com.box.graphql.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.graphql.models.*;
import com.box.graphql.repositories.*;

import java.util.List;
import java.util.Optional;


@Service
public class ArticleService {

    @Autowired
    private ArticleRepo articleRepo;


    public Optional<Article> getArticleById(int uuid) {
        return articleRepo.findById(uuid);
    }


    public List<Article> getArticles() {
        return articleRepo.findAll();
    }

    public List<Article> getArticles(int person_id) {
        return null;
    }
}