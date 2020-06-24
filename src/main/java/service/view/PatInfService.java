package service.view;

import entity.view.PatInf;

import java.util.List;

/**
 * @author yuan
 * @project SIVF
 * @description 患者信息服务
 * @date 2020/6/23 16:04
 **/
public interface PatInfService {

    List<PatInf> queryAllPat();
}
