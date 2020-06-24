package dao;

import entity.view.Reservation;

import java.util.List;

public interface ReservationMapper {
    int insert(Reservation record);

    int insertSelective(Reservation record);

    List<Reservation> selectToday();
}