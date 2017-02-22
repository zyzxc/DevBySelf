package impl;

import dao.IUserDao;
import model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by zhangxingcai on 2017/2/21 0021.
 */
@Service("userImpl")
@Transactional
public class UserImpl implements IUserDao {
    private IUserDao userDao;

    @Override
    public List<User> getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void del(int id) {
        userDao.del(id);
    }

    @Override
    public void alter(int id) {
        userDao.alter(id);
    }
}
