package com.ensolvers.todolist.controllers;

import com.ensolvers.todolist.dao.ToDoListsDao;
import com.ensolvers.todolist.models.list;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoListController {
    @Autowired
    private ToDoListsDao toDoListDao;

    @RequestMapping(value= "api/todolists", method = RequestMethod.GET)
    public List<list> getToDoLists(){
        return toDoListDao.getToDoLists();}

    @RequestMapping(value= "api/todolists/{listId}", method = RequestMethod.DELETE)
    public void eraseToDoList(@PathVariable Long listId){toDoListDao.deleteToDoList(listId);}

    @RequestMapping(value= "api/todolists", method = RequestMethod.POST)
    public void createToDoList(@RequestBody list todolist){toDoListDao.createToDoList(todolist);}
}
