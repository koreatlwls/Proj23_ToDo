package com.example.proj23_todo.domain.todo

import com.example.proj23_todo.data.repository.ToDoRepository
import com.example.proj23_todo.domain.UseCase

internal class DeleteToDoItemUseCase(
    private val toDoRepository: ToDoRepository
): UseCase {

    suspend operator fun invoke(id: Long) {
        return toDoRepository.deleteToDoItem(id)
    }

}