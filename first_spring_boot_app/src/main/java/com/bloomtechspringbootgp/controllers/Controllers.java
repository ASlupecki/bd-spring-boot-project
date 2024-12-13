package com.bloomtechspringbootgp.controllers;

import com.bloomtechspringbootgp.model.theDataForRequest;
import org.springframework.web.bind.annotation.*;

//this class will hold controllers for our server

@RestController  //Tells the server there are REST controller methods in this class
public class Controllers {

    //Define a method to handle HTTP GET requests for the root URL path
    @GetMapping(value = "/") // the method that follows will handle HTTP GETS for "/"
    public String rootPathMethod() { // Method name can be anything
        System.out.println("Method for a GET with the path '/' was executed");
        return "Root path method was called";
    }

    //Define a method to handle HTTP GET requests for URL path "/startrek"
    //  with a query parameter of "character = whoTheyAre"
    //To access data in a query parameter - use @RequestParam annotation in the method param list

    //@RequestParam data-type name-of-query-parameter
    @GetMapping(value = "/startrek")
    public String starMethod(@RequestParam String whoTheyAre) {
        System.out.println("Controller method for a GET with the path '/startrek' was executed");
        return "Star Trek Method was called with parameter value: " + whoTheyAre;
    }

    @GetMapping(value = "/startrek/Spock")
    public String spockMethod() {
        System.out.println("Controller method for a GET with the path '/startrek' was executed");
        return "Live Long and Prosper";
    }

    //Define a method to handle an HTTP POST request for URL path '/'
    //@RequestBody allows access to data in the request body

    //@RequestBody class-name object-name
    @PostMapping(value = "/")
    public String wilburPost(@RequestBody theDataForRequest dataPassedIN) {
        System.out.println("Controller method for POST with the path '/' was executed");
        System.out.println("The data sent with the request was: " + dataPassedIN);
        return "Mr. Ed the talking horse";
    }
}
