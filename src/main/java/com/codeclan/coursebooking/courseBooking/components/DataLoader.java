package com.codeclan.coursebooking.courseBooking.components;


import com.codeclan.coursebooking.courseBooking.models.Booking;
import com.codeclan.coursebooking.courseBooking.models.Course;
import com.codeclan.coursebooking.courseBooking.models.Customer;
import com.codeclan.coursebooking.courseBooking.repositories.BookingsRepository;
import com.codeclan.coursebooking.courseBooking.repositories.CourseRepository;
import com.codeclan.coursebooking.courseBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingsRepository bookingsRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }


    public void run(ApplicationArguments args){


        Customer jeff = new Customer("Jeff", "Edinburgh", 29);
        customerRepository.save(jeff);
        Customer bob = new Customer("Bob", "Glasgow", 7);
        customerRepository.save(bob);


        Course webDev = new Course("Web Dev", "Edinburgh", 2);
        courseRepository.save(webDev);
        Course dataScience = new Course("Data", "Glasgow", 4);
        courseRepository.save(dataScience);
        Course typing = new Course("Typing", "Online", 4);
        courseRepository.save(typing);

        Booking date1 = new Booking("22-10-23", webDev, jeff);
        bookingsRepository.save(date1);
        Booking date2 = new Booking("29-02-23", dataScience, bob);
        bookingsRepository.save(date2);
        Booking date3 = new Booking("31/12/2026", typing, jeff);
        bookingsRepository.save(date3);



    }
}
