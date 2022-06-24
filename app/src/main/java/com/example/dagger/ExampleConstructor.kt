package com.example.dagger

import android.content.Context
import javax.inject.Inject
import javax.inject.Named

//class ExampleConstructor @Inject constructor() {
//
//    fun getAppName(context:Context):String{
////we dont have to mention it in Interface can be directly accessed in the activity
//        return context.getString(R.string.app_name)
//    }

class ExampleConstructor @Inject constructor(@Named("TestClass1") private val testClass: TestClass) {
    fun getAppName(context: Context):String{
        return testClass.s1
    }
}