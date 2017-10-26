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

    @Getter
    private String author;

    @Getter
    private String title;

    @Getter
    private String description;

    @Getter
    private String url;

    @Getter
    private String urlToImage;

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
