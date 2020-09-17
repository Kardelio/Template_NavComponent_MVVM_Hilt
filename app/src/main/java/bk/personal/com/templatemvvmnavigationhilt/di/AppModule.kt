package bk.personal.com.templatemvvmnavigationhilt.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    fun provideRandomSampleString(): String {
        return "This is a sample"
    }
}