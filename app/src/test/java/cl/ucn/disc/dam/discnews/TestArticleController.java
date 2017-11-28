package cl.ucn.disc.dam.discnews;

import org.apache.commons.lang3.time.StopWatch;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import cl.ucn.disc.dam.discnews.adapters.ArticleAdapter;
import cl.ucn.disc.dam.discnews.controller.ArticleController;
import cl.ucn.disc.dam.discnews.model.Article;
import lombok.extern.slf4j.Slf4j;

/**
 * throws
 */
@Slf4j
public final class TestArticleController {

    /**
     * @throws IOException
     */
    @Test
    public void testConnection() throws IOException {

        final StopWatch stopWatch = StopWatch.createStarted();
        log.debug("Starting test connection ..");

        final ArticleController nc = new ArticleController();
        final List<Article> articles = nc.getArticles("techcrunch,ars-technica,engadget,buzzfeed,wired");
        Assertions.assertThat(articles).isNotNull();
        Assertions.assertThat(articles).isNotEmpty();

        log.debug("Size: {}", articles.size());

        for (final Article article : articles) {

            log.debug("Article: {}", article);
            //log.debug("Article Pretty: {}", ArticleAdapter.PRETTY_TIME.format(article.getPublishedAtDateTime().toDate()));
        }

        log.info("Test in: {}", stopWatch);

    }
}
