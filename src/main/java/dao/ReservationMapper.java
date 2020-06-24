package dao;

import entity.view.Reservation;

public interface ReservationMapper {
    int insert(Reservation record);

    int insertSelective(Reservation record);
}