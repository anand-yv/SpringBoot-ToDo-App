package com.anand.springboot.myFirstWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();
    private static int toDoCounts = 0;
    static {
        todos.add(new Todo(++toDoCounts, "anand", "Learn Spring", LocalDate.now().plusYears(0), true));
        todos.add(new Todo(++toDoCounts, "anand", "Learn SpringBoot", LocalDate.now().plusMonths(1),false));
        todos.add(new Todo(++toDoCounts, "anand", "Make Project", LocalDate.now().plusMonths(2),false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }

    public void addTodo(String username, String description, LocalDate localDate, boolean done){
        todos.add(new Todo(++toDoCounts,username,description,localDate, done));
    }

    public void deleteById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
