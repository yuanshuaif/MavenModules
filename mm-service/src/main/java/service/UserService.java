package service;

import entity.User;

import java.util.List;

/**
 * Created by 10326 on 2020/1/31.
 */
public interface UserService {

    public List<User> list();

    public String hello();
}
