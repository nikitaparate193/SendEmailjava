package com.example.SpringBootAnnotation.SpringBootTest;

import com.example.SpringBootAnnotation.SpringBootTest.MyObjects.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigurationAnnotation {
    @Bean("Name1")
    public Students getStudentsObject1(){
        System.out.println("Inside bean method getStudentsObject1" );
        return new Students("Nikita");
    }

    @Bean("Name2")
    public Students getStudentsObject2(){
        System.out.println("Inside bean method getStudentsObject2" );
        return new Students("Swati");
    }

}
