package dao;

import entity.view.LoginUserInfo;

public interface LoginUserInfoMapper {
    int deleteByPrimaryKey(String userid);

    int insert(LoginUserInfo record);

    int insertSelective(LoginUserInfo record);

    LoginUserInfo selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(LoginUserInfo record);

    int updateByPrimaryKey(LoginUserInfo record);
}