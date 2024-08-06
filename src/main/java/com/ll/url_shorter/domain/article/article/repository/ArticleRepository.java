package com.ll.url_shorter.domain.article.article.repository;

import com.ll.url_shorter.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
