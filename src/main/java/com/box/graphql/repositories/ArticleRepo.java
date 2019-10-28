package com.box.graphql.repositories;

import org.springframework.data.jpa.repository.*;
import com.box.graphql.models.Article;

import java.util.List;

public interface ArticleRepo extends JpaRepository<Article, Integer> {

}