package dao.impl;

import base.dao.BaseDao;
import dao.PatInfMapper;
import entity.view.PatInf;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yuan
 * @project SIVF
 * @description TODO
 * @date 2020/6/23 15:38
 **/
@Repository
public class PatInfMapperImpl extends BaseDao implements PatInfMapper {

    public PatInfMapperImpl() {
        this.url = "dao.PatInfMapper.";
    }

    @Override
    public int insert(PatInf record) {
        return 0;
    }

    @Override
    public int insertSelective(PatInf record) {
        return 0;
    }

    @Override
    public List<PatInf> selectAll() {
        return this.getSqlSession().selectList("selectAll");
    }
}
