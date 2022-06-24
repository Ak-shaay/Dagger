package com.example.dagger.dag

import com.example.dagger.App
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
    TestModule::class,
    SubComponentModule::class,
    InterfaceModule::class
    ]
)
interface AppComponent:AndroidInjector<App> {
}