package com.huawei.servers;
import com.huawei.dao.UserDaoImpl;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDaoImpl getByid(String userid) {
        System.out.println("执行的具体的业务逻辑：getById");
        return new UserDaoImpl();
    }

    @Override
    public boolean add() {
        System.out.println("执行具体的业务逻辑： add....");
        return true;
    }

    @Override
    public boolean delete(String userid) {
        System.out.println("执行具体的业务逻辑：delete...");
        return true;
    }

    @Override
    public boolean update() {
        System.out.println("执行具体的业务逻辑：update。。。");
        return true;

    }
}
