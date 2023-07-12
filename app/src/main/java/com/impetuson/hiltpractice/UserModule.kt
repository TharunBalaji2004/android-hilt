package com.impetuson.hiltpractice

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
abstract class UserModule {
    @Binds
    @Named("sql")
    abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository

    @Binds
    @CustomFirebaseQualifier
    abstract fun bindsSQLRepository(firebaseRepository: FirebaseRepository): UserRepository
}

/*
@InstallIn
SingletonComponent - creation of object at global or app level
ActivityComponent - creation of object at activity level
FragmentComponent - creation of object at fragment level
*/