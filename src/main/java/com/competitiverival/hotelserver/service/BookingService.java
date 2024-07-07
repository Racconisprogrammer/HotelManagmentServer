package com.competitiverival.hotelserver.service;

import com.competitiverival.hotelserver.dto.ReservationDto;
import com.competitiverival.hotelserver.dto.ReservationResponseDto;

public interface BookingService {

    boolean postReservation(ReservationDto reservationDto);

    ReservationResponseDto getAllReservationByUserId(Long userId, int pageNumber);
}
