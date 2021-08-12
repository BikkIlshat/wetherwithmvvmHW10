package com.hfad.wetherwithmvvm.di

import com.hfad.wetherwithmvvm.framework.ui.main.MainViewModel
import com.hfad.wetherwithmvvm.model.repository.Repository
import com.hfad.wetherwithmvvm.model.repository.RepositoryImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single<Repository> {RepositoryImpl()}

    //View models
    viewModel { MainViewModel(get()) }
}