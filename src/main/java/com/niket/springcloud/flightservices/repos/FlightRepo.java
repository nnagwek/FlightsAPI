package com.niket.springcloud.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niket.springcloud.flightservices.models.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {

}
