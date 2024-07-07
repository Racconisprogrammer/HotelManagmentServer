package com.competitiverival.hotelserver.service;

import com.competitiverival.hotelserver.dto.RoomDto;
import com.competitiverival.hotelserver.dto.RoomResponseDto;

public interface RoomService {

    boolean postRoom(RoomDto roomDto);

    RoomResponseDto getAllRooms(int pageNumber);

    RoomDto getRoomById(Long id);

    boolean updateRoom(Long id, RoomDto roomDto);

    void deleteRoom(Long id);
}
