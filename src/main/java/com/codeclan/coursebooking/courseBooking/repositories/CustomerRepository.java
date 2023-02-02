package com.codeclan.coursebooking.courseBooking.repositories;


import com.codeclan.coursebooking.courseBooking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCoursesName(String name);

}
