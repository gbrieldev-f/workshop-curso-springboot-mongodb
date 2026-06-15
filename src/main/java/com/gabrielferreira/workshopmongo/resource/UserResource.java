package com.gabrielferreira.workshopmongo.resource;

import com.gabrielferreira.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User gabriel =  new User("1", "gabriel@gmail.com" , "Gabriel Ferreira");
        User alex = new User("2", "alex@gmail.com", "Alex Green");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(gabriel, alex));
        return ResponseEntity.ok().body(list);
    }
}
