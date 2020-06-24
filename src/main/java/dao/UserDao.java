package dao;

import entity.view.User;
import org.springframework.stereotype.Repository;

/**
 * @ClassName userDao
 * @Description todo
 * @Author hy
 * @Date 2020-06-22 22:20
 * @Version 1.0
 */
@Repository
public interface UserDao {
    public User findExample(String loginName);
}
