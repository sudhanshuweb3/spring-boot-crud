package com.crud.services;

import com.crud.entities.Course;
import java.util.List;

public interface CourseService {
    List<Course> getCourses();
    Course getCourse(Long courseId);
    Course createCourse(Course course);
    Course updateCourse(Long courseId, Course course);
    void deleteCourse(Long courseId);
}
