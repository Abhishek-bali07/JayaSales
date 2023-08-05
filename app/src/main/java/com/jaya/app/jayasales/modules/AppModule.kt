package com.jaya.app.jayasales.modules

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.preferencesDataStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import java.util.prefs.Preferences
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface AppModule {



    companion object {
        private val Context.dataStore by preferencesDataStore("JayaSales")


        @Provides
        @Singleton
        fun provideGlobalCoroutineScope(): CoroutineScope =
            CoroutineScope(context = Dispatchers.Main + SupervisorJob())

        @Singleton
        @Provides
        fun provideDataStore(@ApplicationContext appContext: Context): DataStore<androidx.datastore.preferences.core.Preferences> =
            appContext.dataStore

    }


}