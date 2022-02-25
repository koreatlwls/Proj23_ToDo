package com.example.proj23_todo.domain.todo

import com.example.proj23_todo.data.entity.ToDoEntity
import com.example.proj23_todo.data.repository.ToDoRepository
import com.example.proj23_todo.domain.UseCase

internal class InsertToDoUseCase(
    private val toDoRepository: ToDoRepository
): UseCase {

    suspend operator fun invoke(toDoEntity: ToDoEntity): Long {
        return toDoRepository.insertToDoItem(toDoEntity)
    }

}