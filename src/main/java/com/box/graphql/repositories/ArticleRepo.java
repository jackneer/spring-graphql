package com.box.graphql.repositories;

import org.springframework.data.jpa.repository.*;
import com.box.graphql.models.Article;

import java.util.List;

public interface ArticleRepo extends JpaRepository<Article, Integer> {

    // @Query("select a from Article a where a.person_id = ?1")
    // List<Article> findByPerson(int person_id);
}