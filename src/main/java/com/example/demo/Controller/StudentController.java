package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping
    public String getStudent(){
        System.out.println("============ Get Student Executed ============");
        System.out.println("============ ");
        System.out.println("this  is from develope");
        return "</br></br></br><h1 style='color:red;text-align:center;'>Hi this code is changed by featurBranch2</h1>";
    }
}
