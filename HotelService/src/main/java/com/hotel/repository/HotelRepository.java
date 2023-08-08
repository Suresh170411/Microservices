package com.hotel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {

    public Optional<Hotel> findByName(String name);

    public Optional<Hotel> findByLocation(String location);
}
