package com.example.jetnotes.di

import com.example.jetnotes.data.db.dao.NotesDao
import com.example.jetnotes.data.repository.NotesRepositoryImpl
import com.example.jetnotes.domain.repository.NotesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideNotesRepository(notesDao: NotesDao): NotesRepository = NotesRepositoryImpl(notesDao)

}