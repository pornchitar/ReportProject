/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.reportproject;

import java.util.List;

/**
 *
 * @author werapan
 */
public class UserService {
    public static User currentUser;
    public User login(String login, String password) {
        UserDao userDao = new UserDao();
        User user = userDao.getByLogin(login);
        if(user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public static User getCurrentUser() {
        return new User(6, "werapan", "Worawit", "Password", 0, "M");
    }
    
    public List<User> getUsers(){
        UserDao userDao = new UserDao();
        return userDao.getAll(" user_login asc");
    }

    public User addNew(User editedUser) throws Exception {
        if(!editedUser.isValid()){
            throw new ValidateException("User is invalid!!!");
        }
        UserDao userDao = new UserDao();
        return userDao.save(editedUser);
    }

    public User update(User editedUser) throws Exception {
        if(!editedUser.isValid()){
            throw new ValidateException("User is invalid!!!");
        }
        UserDao userDao = new UserDao();
        return userDao.update(editedUser);
    }

    public int delete(User editedUser) {
        UserDao userDao = new UserDao();
        return userDao.delete(editedUser);
    }
}
