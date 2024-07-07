package com.competitiverival.hotelserver.service.impl;

import com.competitiverival.hotelserver.domain.Room;
import com.competitiverival.hotelserver.dto.RoomResponseDto;
import com.competitiverival.hotelserver.repository.CustomerRoomRepository;
import com.competitiverival.hotelserver.service.CustomerRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CustomerRoomServiceImpl implements CustomerRoomService {

    private final CustomerRoomRepository customerRoomRepository;


    @Override
    public RoomResponseDto getAvailableRooms(int pageNumber) {
        Pageable pageable = PageRequest.of(pageNumber, 6);
        Page<Room> roomPage = customerRoomRepository.findByAvailable(true, pageable);

        RoomResponseDto roomResponseDto = new RoomResponseDto();
        roomResponseDto.setPageNumber(roomPage.getPageable().getPageNumber());
        roomResponseDto.setTotalPages(roomPage.getTotalPages());
        roomResponseDto.setRoomDtoList(roomPage.stream().map(Room::getRoomDto).collect(Collectors.toList()));
        return roomResponseDto;
    }
}
