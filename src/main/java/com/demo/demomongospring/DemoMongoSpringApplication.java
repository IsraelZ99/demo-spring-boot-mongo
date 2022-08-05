package com.demo.demomongospring;

import com.demo.demomongospring.model.Address;
import com.demo.demomongospring.model.Gender;
import com.demo.demomongospring.model.Student;
import com.demo.demomongospring.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DemoMongoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMongoSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate) {
        return args -> {
//            Address address = new Address("Mexico", "CDMX", "5432");
//            String email = "miguel@gmail.com";
//            Student student = new Student("Miguel", "Lopez",
//                    email, Gender.MALE, address,
//                    List.of("Computer", "Science"),
//                    BigDecimal.TEN, LocalDateTime.now());
//            repository.findStudentByEmail(email).ifPresentOrElse(s -> {
//                System.out.println(student.getEmail() + " already exists");
//            }, () -> {
//                System.out.println("Inserting student " + student);
//                repository.save(student);
//            });

//            Query query = new Query();
//            query.addCriteria(Criteria.where("email").is(email));
//            List<Student> students = mongoTemplate.find(query, Student.class);
//            if (students.size() > 1) {
//                throw new IllegalStateException("Found many students with email " + email);
//            }
//            if (students.isEmpty()) {
//                System.out.println("Inserting student " + student);
//                repository.save(student);
//            } else {
//                System.out.println(student.getEmail() + " already exists");
//            }
        };
    }

}
