package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {
    @RequestMapping("/")
    public String sayHello(){
        Scanner newInput=new Scanner(System.in);
        String input=newInput.nextLine();

    }
}
