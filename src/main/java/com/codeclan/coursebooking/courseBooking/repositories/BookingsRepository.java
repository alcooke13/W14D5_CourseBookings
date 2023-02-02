package com.codeclan.coursebooking.courseBooking.repositories;

import com.codeclan.coursebooking.courseBooking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingsRepository extends JpaRepository<Booking, Long> {

}
