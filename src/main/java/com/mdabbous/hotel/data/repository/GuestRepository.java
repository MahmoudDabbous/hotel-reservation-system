package com.mdabbous.hotel.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdabbous.hotel.data.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
