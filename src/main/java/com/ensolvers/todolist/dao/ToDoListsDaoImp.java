package com.ensolvers.todolist.dao;

import com.ensolvers.todolist.models.list;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class ToDoListsDaoImp implements ToDoListsDao {
    @PersistenceContext
    private EntityManager entityManager;
    public ToDoListsDaoImp(){

    }
    @Override
    @Transactional
    public List<list> getToDoLists() {
        String query = "FROM list WHERE active=true";
        /*
        list todo1 = new list();
        todo1.setName("N1");
        List<list> lists = new ArrayList<list>(){{


            add(todo1);}
        };
        lists.add(todo1);

         */
        return (List<list>) entityManager.createQuery(query).getResultList();
    }

    @Override
    public void createToDoList(list toDoList) {
    entityManager.merge(toDoList);
    }

    @Override
    public void deleteToDoList(Long listId) {

    }
}
