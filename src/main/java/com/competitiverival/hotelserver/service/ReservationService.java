package com.competitiverival.hotelserver.service;

import com.competitiverival.hotelserver.dto.ReservationResponseDto;

public interface ReservationService {

    ReservationResponseDto getAllReservations(int pageNumber);

    boolean changeReservationsStatus(Long id, String status);
}
