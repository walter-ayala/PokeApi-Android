package com.example.pokeApi

import android.app.Application
import com.example.pokeApi.di.appModule
import com.example.pokeApi.di.retrofitModule
import com.example.pokeApi.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class Pokemon : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Pokemon)
            modules(listOf(appModule, retrofitModule, viewModelModule))
        }
    }
}