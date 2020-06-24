package service.view;

import entity.view.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description todo
 * @Author hy
 * @Date 2020-06-22 21:21
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from login_user_info")
    List<User> getusers();
}
