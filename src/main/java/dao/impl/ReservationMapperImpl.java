package dao.impl;

import base.dao.BaseDao;
import dao.ReservationMapper;
import entity.view.Reservation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yuan
 * @project sivf_client
 * @description 预约信息dao实现
 * @date 2020/6/24 14:33
 **/
@Repository
public class ReservationMapperImpl extends BaseDao implements ReservationMapper {

    public ReservationMapperImpl() {
        this.url = "dao.ReservationMapper.";
    }

    @Override
    public int insert(Reservation record) {
        return 0;
    }

    @Override
    public int insertSelective(Reservation record) {
        return 0;
    }

    /**
     * 查询今天的预约
     * @return
     */
    @Override
    public List<Reservation> selectToday() {
        return this.getSqlSession().selectList(url+"selectToday");
    }
}
