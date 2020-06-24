package dao;

import entity.view.PatInf;

import java.util.List;

public interface PatInfMapper {
    int insert(PatInf record);

    int insertSelective(PatInf record);

    List<PatInf> selectAll();
}