/**
 * <p>Copyright (C) Calade Technologies, Inc - All Rights Reserved Unauthorized copying of this
 * file, via any medium is strictly prohibited Proprietary and confidential
 */
package ajincodewcommunity.ajincodewbackend.controller;

import ajincodewcommunity.ajincodewbackend.entities.Course;
import ajincodewcommunity.ajincodewbackend.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO: add your documentation
 *
 * <p>Created 23 juin 2025</p>
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/courses")
public class CourseController {
    private final CourseService courseService;

    @GetMapping
    public List<Course> findAllCourses(){
        return courseService.getAllCourses();
    }
}
