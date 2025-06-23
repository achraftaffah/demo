/**
 * <p>Copyright (C) Calade Technologies, Inc - All Rights Reserved Unauthorized copying of this
 * file, via any medium is strictly prohibited Proprietary and confidential
 */
package ajincodewcommunity.ajincodewbackend.service;

import ajincodewcommunity.ajincodewbackend.entities.Course;
import ajincodewcommunity.ajincodewbackend.repositories.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO: add your documentation
 *
 * <p>Created 23 juin 2025</p>
 */
@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public void saveCourse(Course course){
        courseRepository.save(course);
    }
}
