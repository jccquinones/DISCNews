package cl.ucn.disc.dam.discnews.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * Clase generada via http://www.jsonschema2pojo.org/
 */

@Builder
public final class Article {

    /**
     * Author
     */
    @Getter
    private String author;

    /**
     * Title
     */
    @Getter
    private String title;

    /**
     * Description
     */
    @Getter
    private String description;

    /**
     * URL: main link
     */
    @Getter
    private String url;

    /**
     * URL: link to image
     */
    @Getter
    private String urlToImage;

    /**
     * Date, example: 2017-11-16T19:40:25Z
     */
    @Getter
    private Date publishedAt;

    /**
     * Source
     */
    @Getter
    Source source;

    /**
     * @return representacion en formato String de Article
     */
    @Override
    public String toString(){
        return ToStringBuilder
                .reflectionToString(this,
                        ToStringStyle.MULTI_LINE_STYLE);
    }

    /**
     * Fix the article
     *
     * @param article to fix.
     */
    public static void fix(final Article article) {

        final StringBuilder sb = new StringBuilder();
        sb.append(article.title);
        sb.append("-");
        sb.append(article.publishedAt);

        // Calculate ID from title + publishedAt
        //article.id = UUID.nameUUIDFromBytes(sb.toString().getBytes());

        if (article.author == null) {
            article.author = "unknow";
        }
    }

    /**
     * Internal article source.
     */
    @Builder
    @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
    public static final class Source {

        /**
         *
         */
        @Getter
        String id;

        /**
         *
         */
        @Getter
        String name;

        /**
         * @return the String representation.
         */
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
        }

    }


}