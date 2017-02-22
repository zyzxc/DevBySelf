package dao;

import model.User;

import java.util.List;

/**
 * Created by zhangxingcai on 2017/2/21 0021.
 */
public interface IUserDao {
    List<User> getUserByName(String name);
    User getUserById(int id);
    public void add(User user);
    public void del(int id);
    public void alter(int id);
}
