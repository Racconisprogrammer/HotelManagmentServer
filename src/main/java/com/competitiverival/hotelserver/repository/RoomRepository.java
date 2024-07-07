package com.competitiverival.hotelserver.repository;

import com.competitiverival.hotelserver.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {


}
