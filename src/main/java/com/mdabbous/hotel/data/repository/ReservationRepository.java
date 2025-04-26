package com.mdabbous.hotel.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdabbous.hotel.data.entity.Reservation;

import java.sql.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
  List<Reservation> findAllByReservationDate(Date date);
}
