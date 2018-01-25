package me.richard.demospringboot;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;
import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String showIndex()
    {
        String userName = "fellow Human";
        System.out.println ("Hello," + userName);
        //Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a value then go to localhost:8080");
        //userName = keyboard.nextLine();
        String greet = "Hello" + userName;
        System.out.println("greet");

        return greet;
    }










}
