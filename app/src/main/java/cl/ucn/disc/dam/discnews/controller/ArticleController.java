package cl.ucn.disc.dam.discnews.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

import cl.ucn.disc.dam.discnews.model.Article;
import cl.ucn.disc.dam.discnews.model.NewsApi;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Clase Principal que contiene los metodos de acceso a las noticias.
 */
@Slf4j
public final class ArticleController {

    /**
     * Des-Serializador GSON
     */
    public static final Gson gson = new GsonBuilder()
            .serializeNulls()
            .create();
    /**
     * URL desde donde se obtendran los {@link Article}
     */
    final String url = "https://newsapi.org/v1/articles?source=espn&sortBy=latest&apiKey=135ccdb34eda4bbf9c10d3d0923eedab";

    /**
     * Cliente OkHttp
     */
    private final OkHttpClient client = new OkHttpClient();

    /**
     * Obtencion de {@link Article}s desde Internet.
     * @return the {@link List} of {@link Article}.
     */
    public List<Article> getArticles() throws IOException{

        // Peticion
        final Request request = new Request.Builder()
                .url(url)
                .build();

        // Respuesta
        Response response = client.newCall(request).execute();
        final String json = response.body().string();

        final NewsApi newsApi = gson.fromJson(json,NewsApi.class);

        return null;
    }
}
