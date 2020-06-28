package service.view.impl;

import dao.PatInfMapper;
import entity.view.PatInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.view.PatInfService;
import utils.CharacterUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yuan
 * @project SIVF
 * @description 患者信息服务实现
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

    @Override
    public List<PatInf> queryLikeName(String name) {
        // 所有患者信息
        List<PatInf> patInfs = new ArrayList<>();

        // 全部患者
        List<PatInf> patInfsAll = patInfMapper.selectAll();
        if (!CharacterUtil.isChinese(name)) {
            patInfs = patInfsAll.stream().filter(e -> name.equals(CharacterUtil.getFirstSpell(e.getName())))
                    .collect(Collectors.toList());
        } else {
            patInfs = patInfMapper.selectByName(name);
        }
        return patInfs;
    }
}
