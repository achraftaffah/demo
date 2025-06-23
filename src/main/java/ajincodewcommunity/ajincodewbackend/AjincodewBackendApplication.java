package ajincodewcommunity.ajincodewbackend;

import ajincodewcommunity.ajincodewbackend.entities.Course;
import ajincodewcommunity.ajincodewbackend.service.CourseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class AjincodewBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AjincodewBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CourseService courseService){
        return args -> {
            Course course = new Course();
            course.setId(UUID.randomUUID().toString());
            course.setName("Backend");
            course.setDescription("Backend course with spring boot");
            courseService.saveCourse(course);
        };
    }

}
