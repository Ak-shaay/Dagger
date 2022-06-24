package com.example.dagger.dag

import com.example.dagger.intr.Shape
import com.example.dagger.intr.Square
import dagger.Binds
import dagger.Module

@Module
abstract class InterfaceModule {

    @Binds
    // when using Binds fun should not contain more than one parameter
    // return type should be an interface
    abstract fun providesSquare(square: Square):Shape


}