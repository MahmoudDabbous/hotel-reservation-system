package com.mdabbous.hotel.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mdabbous.hotel.data.entity.Room;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Long> {
  Optional<Room> findByRoomNumberIgnoreCase(String roomNumber);
}
