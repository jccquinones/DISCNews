package cl.ucn.disc.dam.discnews;

import android.app.Application;

import org.apache.commons.lang3.time.StopWatch;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by JOHN on 28-11-2017.
 */
@Slf4j
public final class App extends Application {

    /**
     *
     */
    @Override
    public void onCreate() {
        super.onCreate();

        // Timer
        final StopWatch stopWatch = StopWatch.createStarted();

        // Timming
        log.debug("Initialization in: {}", stopWatch);

    }
}
