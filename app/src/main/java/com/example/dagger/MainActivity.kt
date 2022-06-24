package com.example.dagger

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed
import com.example.dagger.databinding.ActivityMainBinding
import com.example.dagger.intr.Shape
import com.example.dagger.intr.Square
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Named

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    @Inject
    @Named("TestClass2")
    lateinit var testClass: TestClass

    @Inject
    lateinit var testClass2: TestClass2

    @Inject
    lateinit var exampleConstructor: ExampleConstructor

    @Inject
    lateinit var shape: Shape


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(binding.root)

//        binding.textview.text = testClass.s1

//         //constructor
//        binding.textview.text = exampleConstructor.getAppName(this)


//       //interface
//       val shape : Shape = Square()
//       binding.textview.text =shape.draw()

//        //Singleton
       testClass.toString().let {
           println(it)
           binding.textview.append(it)
       }
        Handler(Looper.getMainLooper()).postDelayed({
        startActivity(Intent(this,SecondActivity::class.java))
        },3000L)
    }
}