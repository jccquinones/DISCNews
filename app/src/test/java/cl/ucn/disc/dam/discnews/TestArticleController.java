package cl.ucn.disc.dam.discnews;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import cl.ucn.disc.dam.discnews.controller.ArticleController;
import cl.ucn.disc.dam.discnews.model.Article;

/**
 * throws
 */

public final class TestArticleController {

    @Test
    public void testConnection() throws IOException{

        final ArticleController nc = new ArticleController();
        final List<Article> articles = nc.getArticles();
        Assertions.assertThat(articles).isNotNull();
        Assertions.assertThat(articles).hasSize(10);
    }
}
