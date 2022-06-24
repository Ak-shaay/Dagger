package com.example.dagger.dag

import com.example.dagger.MainActivity
import com.example.dagger.SecondActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Singleton
@Module
abstract class SubComponentModule {

    @ContributesAndroidInjector
    abstract fun mainActivity():MainActivity

//    @ContributesAndroidInjector
//    abstract fun secondActivity(): SecondActivity
}

