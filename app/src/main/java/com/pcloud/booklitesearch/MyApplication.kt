package com.pcloud.booklitesearch

import android.app.Application
import android.content.pm.PackageManager
import com.pcloud.booklitesearch.di.apiModule
import com.pcloud.booklitesearch.di.networkModule
import com.pcloud.booklitesearch.di.roomModule
import com.pcloud.booklitesearch.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            androidFileProperties()
            modules(viewModelModule, roomModule, apiModule, networkModule)
        }
    }
}