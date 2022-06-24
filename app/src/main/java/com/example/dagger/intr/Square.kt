package com.example.dagger.intr

import javax.inject.Inject

class Square @Inject constructor() :Shape {
    override fun draw(): String {

        return "draw() of Square is called :Shape interface "
    }
}