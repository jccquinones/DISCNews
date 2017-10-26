package cl.ucn.disc.dam.discnews;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

import cl.ucn.disc.dam.discnews.model.NewsApi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by JOHN on 26-10-2017.
 */

public class TestNewsWeb {

    @Test
    public void testConnection() throws IOException{

        final String url = "https://newsapi.org/v1/articles?source=espn&sortBy=top&apiKey=135ccdb34eda4bbf9c10d3d0923eedab";

        OkHttpClient client = new OkHttpClient();
        Assertions.assertThat(client).isNotNull();

        final Request request = new Request.Builder()
                .url(url)
                .build();

        Assertions.assertThat(request).isNotNull();

        Response response = client.newCall(request).execute();
        final String json = response.body().string();

        Assertions.assertThat(json).isNotBlank();

        //System.out.println(json);

        Gson gson = new GsonBuilder()
                .serializeNulls()
                .setPrettyPrinting() // TODO: Eliminar en modo produccion
                .create();

        // Des-serializar
        final NewsApi newsApi = gson.fromJson(json,NewsApi.class);

        String strApi = newsApi.toString();

        System.out.println(strApi);

        Assertions.assertThat(newsApi)
                .isNotNull();

        /*Assertions.assertThat(newsApi)
                .isEqualToComparingFieldByField(json);
        */

    }
}
