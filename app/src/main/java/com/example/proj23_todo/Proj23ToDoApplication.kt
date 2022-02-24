package com.example.proj23_todo

import android.app.Application
import com.example.proj23_todo.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class Proj23ToDoApplication  : Application(){

    override fun onCreate() {
        super.onCreate()
        //TODO Koin Trigger
        startKoin{
            androidLogger(Level.ERROR)
            androidContext(this@Proj23ToDoApplication)
            modules(appModule)
        }
    }
}