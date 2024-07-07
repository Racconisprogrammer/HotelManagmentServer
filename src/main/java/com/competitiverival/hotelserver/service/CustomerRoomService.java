package com.competitiverival.hotelserver.service;

import com.competitiverival.hotelserver.dto.RoomResponseDto;

public interface CustomerRoomService {

    RoomResponseDto getAvailableRooms(int pageNumber);
}
