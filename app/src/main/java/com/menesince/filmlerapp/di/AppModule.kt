package com.menesince.filmlerapp.di

import com.menesince.filmlerapp.data.datasource.FilmlerDataSource
import com.menesince.filmlerapp.data.repo.FilmlerRepostory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFilmlerDataSource() : FilmlerDataSource {
        return FilmlerDataSource()
    }
    @Provides
    @Singleton
    fun provideFilmlerRepository(fds : FilmlerDataSource) : FilmlerRepostory {
        return FilmlerRepostory(fds)
    }
}