package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textview.MaterialTextView
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Named

class SecondActivity : DaggerAppCompatActivity() {

    @Inject
    @Named("TestClass1")
    lateinit var testClass: TestClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tv = findViewById<MaterialTextView>(R.id.textview)
        testClass.toString().let{
            println(it)
            tv.append(it)
        }
    }
}