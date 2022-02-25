package com.example.proj23_todo.di

import com.example.proj23_todo.data.repository.TestToDoRepository
import com.example.proj23_todo.data.repository.ToDoRepository
import com.example.proj23_todo.domain.todo.*
import com.example.proj23_todo.presentation.detail.DetailMode
import com.example.proj23_todo.presentation.detail.DetailViewModel
import com.example.proj23_todo.presentation.list.ListViewModel
import org.koin.dsl.module
import org.koin.android.viewmodel.dsl.viewModel


internal val appTestModule = module {

    factory { GetToDoListUseCase(get()) }
    factory { GetToDoItemUseCase(get()) }
    factory { InsertToDoListUseCase(get()) }
    factory { InsertToDoUseCase(get()) }
    factory { DeleteToDoItemUseCase(get()) }
    factory { DeleteAllToDoItemUseCase(get()) }
    factory { UpdateToDoUseCase(get()) }

    single<ToDoRepository> { TestToDoRepository() }

    viewModel { ListViewModel(get(), get(), get()) }
    viewModel { (detailMode: DetailMode, id: Long) -> DetailViewModel(detailMode, id, get(), get(), get(), get()) }

}