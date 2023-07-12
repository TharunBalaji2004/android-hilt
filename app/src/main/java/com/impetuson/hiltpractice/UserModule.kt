package com.impetuson.hiltpractice

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@InstallIn(ActivityComponent::class)
@Module
class UserModule {
    @Provides
    fun providesUserRepository(): UserRepository {
        return FirebaseRepository()
    }
}

/*
@InstallIn
SingletonComponent - creation of object at global or app level
ActivityComponent - creation of object at activity level
FragmentComponent - creation of object at fragment level
*/