package com.example.demo2;

import com.example.demo2.model.Student;
import com.example.demo2.repos.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);

    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student saurabh = new Student("Saurabh", "Khandelwal", "saurabhmasc@gmail.com", 27);
            studentRepository.save(saurabh);
        };
    }

}
