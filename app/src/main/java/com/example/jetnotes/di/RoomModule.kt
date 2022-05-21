package com.example.jetnotes.di

import android.content.Context
import androidx.room.Room
import com.example.jetnotes.data.db.AppDataBase
import com.example.jetnotes.data.db.dao.NotesDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(@ApplicationContext context: Context): AppDataBase =
        Room.databaseBuilder(
            context.applicationContext,
            AppDataBase::class.java,
            "notes_app_database"
        )
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun provideNotesDao(appDataBase: AppDataBase): NotesDao = appDataBase.notesDao()
}