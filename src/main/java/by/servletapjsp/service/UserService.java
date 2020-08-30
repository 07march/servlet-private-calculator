package by.servletapjsp.service;

import by.servletapjsp.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public static List<User> users = new ArrayList<>();

    public void add(User user) {
        users.add(user);
    }

    public void delete(User user) {
        users.remove(user);
    }

    public boolean updateNameById(String name, int id){
        for (User user : users) {
            if (user.getId() == id){
                user.setName(name);
                return true;
            }
        }
        return false;
    }

      public String updateLoginById(String login, int id){
        for (User user : users) {
            if (user.getId() == id){
                user.setLogin(login);
                return login;
            }
        }
        return null;
    }

    public String updatePasswordById(String password, int id){
        for (User user : users) {
            if (user.getId() == id){
                user.setPassword(password);
                return password;
            }
        }
        return null;
    }

    public User findByUserName(String userName){
        for (User user : users) {
            if (user.getLogin().equals(userName)){
                return user;
            }
        }
        return null;
    }
}
