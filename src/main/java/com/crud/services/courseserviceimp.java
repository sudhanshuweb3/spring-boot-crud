package com.crud.services;

import com.crud.Dao.CourseDao;
import com.crud.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseserviceimp implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(Long courseId) {
        return courseDao.findById(courseId).orElse(null);
    }

    @Override
    public Course createCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Long courseId, Course course) {
        return courseDao.findById(courseId).map(existingCourse -> {
            existingCourse.setName(course.getName());
            existingCourse.setEmail(course.getEmail());
            existingCourse.setAge(course.getAge());
            return courseDao.save(existingCourse);
        }).orElse(null);
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseDao.deleteById(courseId);
    }
}
