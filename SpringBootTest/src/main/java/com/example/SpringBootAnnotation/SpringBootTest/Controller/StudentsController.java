package com.example.SpringBootAnnotation.SpringBootTest.Controller;

import com.example.SpringBootAnnotation.SpringBootTest.MailHandler;
import com.example.SpringBootAnnotation.SpringBootTest.MyObjects.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {
    @Autowired
    @Qualifier("Name1")
    Students s;
    @Autowired
    MailHandler h1;
    @GetMapping("Name")
    public String getStudentsName(){
        System.out.println("The application is supposed to send mails");
        h1.sendMail();
        System.out.println("Mail send successfully ");
        return s.getName();
    }


}
