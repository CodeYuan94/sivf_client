package dao.impl;

import base.dao.BaseDao;
import dao.PatInfMapper;
import entity.view.PatInf;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yuan
 * @project SIVF
 * @description 患者信息dao实现
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

    /**
     * 查询所有患者信息
     * @return
     */
    @Override
    public List<PatInf> selectAll() {
        return this.getSqlSession().selectList("selectAll");
    }

    @Override
    public List<PatInf> selectByName(String name) {
        return this.getSqlSession().selectList(url+"selectByName",name);
    }

}
