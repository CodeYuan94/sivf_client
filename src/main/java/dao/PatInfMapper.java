package dao;

import entity.view.PatInf;

import java.util.List;

public interface PatInfMapper {
    int insert(PatInf record);

    int insertSelective(PatInf record);

    List<PatInf> selectAll();

    List<PatInf> selectByName(String name);

    PatInf selectByPid(String pid);

    int updateSelective(PatInf record);
}