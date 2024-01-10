package com.menesince.filmlerapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.menesince.filmlerapp.data.datasource.FilmlerDataSource
import com.menesince.filmlerapp.data.repo.FilmlerRepostory
import com.menesince.filmlerapp.room.Database
import com.menesince.filmlerapp.room.IFilmlerDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFilmlerDataSource(fDao : IFilmlerDao) : FilmlerDataSource {
        return FilmlerDataSource(fDao)
    }
    @Provides
    @Singleton
    fun provideFilmlerRepository(fds : FilmlerDataSource) : FilmlerRepostory {
        return FilmlerRepostory(fds)
    }
    @Provides
    @Singleton
    fun provideFilmlerDao(@ApplicationContext context : Context) : IFilmlerDao {
       val db = Room.databaseBuilder(context,Database::class.java,"filmler.sqlite")
           .createFromAsset("filmler.sqlite").build()
        return db.getFilmlerDao()
    }
}