package com.crud.Dao;
import com.crud.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CourseDao extends JpaRepository<Course,Long> {


}
