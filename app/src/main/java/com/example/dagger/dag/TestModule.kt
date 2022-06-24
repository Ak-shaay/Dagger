package com.example.dagger.dag

import com.example.dagger.TestClass
import com.example.dagger.TestClass2
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class TestModule {

    @Named("TestClass1")
    @Provides
    @Singleton
    fun providesTestClass() : TestClass {
        return TestClass("Dagger Test String")
    }

    @Named("TestClass2")
    @Provides
    fun providesTestClass2() : TestClass {
        return TestClass("Dagger Test String2 from test ")
    }

        @Provides
        fun providesTClass(@Named("TestClass1")testClass: TestClass) : TestClass2 {
            return TestClass2(testClass)

    }
}