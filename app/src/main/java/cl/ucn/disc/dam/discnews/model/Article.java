package cl.ucn.disc.dam.discnews.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Builder;
import lombok.Getter;

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
    private String publishedAt;

    /**
     * @return representacion en formato String de Article
     */
    @Override
    public String toString(){
        return ToStringBuilder
                .reflectionToString(this,
                        ToStringStyle.MULTI_LINE_STYLE);
    }

}