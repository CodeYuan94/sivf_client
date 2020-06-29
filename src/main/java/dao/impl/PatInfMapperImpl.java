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
     *
     * @return
     */
    @Override
    public List<PatInf> selectAll() {
        return this.getSqlSession().selectList("selectAll");
    }

    /**
     * 通过名字模糊查询患者
     *
     * @param name
     * @return
     */
    @Override
    public List<PatInf> selectByName(String name) {
        return this.getSqlSession().selectList(url + "selectByName", name);
    }

    /**
     * 通过pid查询患者
     * @param pid
     * @return
     */
    @Override
    public PatInf selectByPid(String pid) {
        return this.getSqlSession().selectOne(url+"selectByPid", pid);
    }

    /**
     * 更新患者信息
     *
     * @param record
     * @return
     */
    @Override
    public int updateSelective(PatInf record) {
        if (record == null) {
            return -1;
        } else {
            return this.getSqlSession().update(url + "updateByPrimaryKeySelective", record);
        }

    }
}
