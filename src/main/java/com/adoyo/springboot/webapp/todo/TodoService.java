package com.adoyo.springboot.webapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "Adoyo", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Samson", "Write a blog post", LocalDate.now().plusMonths(1), false));
        todos.add(new Todo(3, "Ranga", "Learn Python", LocalDate.now().plusWeeks(1), false));
        todos.add(new Todo(4, "David", "Read a book", LocalDate.now().plusDays(1), false));
        todos.add(new Todo(5, "Keith", "Go for a walk", LocalDate.now(), false));
        todos.add(new Todo(6, "Daisy", "Make dinner", LocalDate.now(), false));
    }

//    public Predicate<Todo> findByUserName(String name) {
//        return todo -> todo.getUsername().equals(name);
//    }

    public List<Todo> findByUserName() {
        return todos;
    }
}

