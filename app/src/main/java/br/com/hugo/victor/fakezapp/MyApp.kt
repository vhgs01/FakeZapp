package br.com.hugo.victor.fakezapp

import android.app.Application
import com.facebook.stetho.Stetho
import com.orhanobut.hawk.Hawk


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        Hawk.init(this).build()
    }

}