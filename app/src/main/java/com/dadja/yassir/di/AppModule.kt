package com.dadja.yassir.di



import com.dadja.yassir.common.CharacterAppConst
import com.dadja.yassir.data.remote.dto.ApiCharactersApp
import com.dadja.yassir.data.repository.CharacterRepositoryImpl
import com.dadja.yassir.domain.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideCharactersAppApi():ApiCharactersApp{
        return Retrofit
            .Builder()
            .baseUrl(CharacterAppConst.MoviesBASE_API)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiCharactersApp::class.java)
    }

    @Provides
    @Singleton
    fun provideCharactersRepository(api:ApiCharactersApp):CharacterRepository{
        return CharacterRepositoryImpl(api)
    }

}