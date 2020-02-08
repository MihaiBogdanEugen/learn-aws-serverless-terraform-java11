package de.mbe.tutorials.aws.serverless.moviesstats.functions.getmovieandstat;

import com.google.inject.AbstractModule;
import de.mbe.tutorials.aws.serverless.moviesstats.functions.getmovieandstat.repositories.MoviesStatsRepository;
import de.mbe.tutorials.aws.serverless.moviesstats.functions.getmovieandstat.repositories.MoviesStatsDynamoDBRepository;

public final class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MoviesStatsRepository.class).to(MoviesStatsDynamoDBRepository.class);
    }
}