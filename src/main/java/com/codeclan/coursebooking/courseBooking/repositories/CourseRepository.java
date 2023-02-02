package com.codeclan.coursebooking.courseBooking.repositories;

import com.codeclan.coursebooking.courseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRatings(int rating);

}
