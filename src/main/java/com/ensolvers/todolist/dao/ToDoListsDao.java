package com.ensolvers.todolist.dao;

import com.ensolvers.todolist.models.list;

import java.util.List;

public interface ToDoListsDao {
    // to obtaine all the active to-do lists
    List<list> getToDoLists();

    //to create a new to-do list
    void createToDoList(list toDoList);

    //to delete a to-do list
    void deleteToDoList(Long listId);

}
