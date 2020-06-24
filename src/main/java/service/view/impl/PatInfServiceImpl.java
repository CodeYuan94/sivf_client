package service.view.impl;

import dao.PatInfMapper;
import entity.view.PatInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.view.PatInfService;

import java.util.List;

/**
 * @author yuan
 * @project SIVF
 * @description TODO
 * @date 2020/6/23 16:04
 **/
@Service
public class PatInfServiceImpl implements PatInfService {

    @Autowired
    private PatInfMapper patInfMapper;

    @Override
    public List<PatInf> queryAllPat() {
        return patInfMapper.selectAll();
    }
}
