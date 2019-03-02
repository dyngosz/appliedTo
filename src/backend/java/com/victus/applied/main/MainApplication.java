package com.victus.applied.main;

import com.victus.applied.entity.Job;
import com.victus.applied.repository.JobRepository;
import com.victus.applied.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.Stream;

@SpringBootApplication
@EnableJpaRepositories("com.victus.applied.repository")
@ComponentScan("com.victus.applied")
@EntityScan("com.victus.applied.entity")
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    ApplicationRunner init(JobRepository jobRepository) {
        return args -> {
            Stream.of("Amazon", "Facebook", "Google", "Delta Unit", "Nokia").forEach(name -> {
                Job job = new Job();
                job.setCompanyName(name);
                job.setPosition("Software Developer at " + name);
                jobRepository.save(job);
            });
            jobRepository.findAll().forEach(System.out::println);
        };
    }

}
