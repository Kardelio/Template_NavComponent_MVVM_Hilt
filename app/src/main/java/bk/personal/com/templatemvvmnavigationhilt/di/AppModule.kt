package bk.personal.com.templatemvvmnavigationhilt.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    fun provideRandomSampleString(): String {
        return "This is a sample"
    }

    @Provides
    fun provideUserPreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("test", Context.MODE_PRIVATE)
    }

}