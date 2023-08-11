package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.exception.HotelException;
import com.hotel.model.Hotel;
import com.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotelById(String id) throws HotelException {
		return hotelRepository.findById(id).orElseThrow(()-> new HotelException("No hotel found with this id"));
	}

	@Override
	public List<Hotel> getHotelList() throws HotelException {
		 if (hotelRepository.findAll().isEmpty()) {
			 throw new HotelException("No hotels found!");
		 }else {
			 return hotelRepository.findAll();
		 }
	}

}
