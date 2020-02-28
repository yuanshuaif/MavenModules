package service;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;

/**
 * Created by 10326 on 2020/1/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserRepository userRepository;

    @Override
    public List<User> list() {
        System.out.println("已经调用到该处了");
        return userRepository.findAll();
    }

    @Override
    public String hello() {
        return "nihao";
    }
}
