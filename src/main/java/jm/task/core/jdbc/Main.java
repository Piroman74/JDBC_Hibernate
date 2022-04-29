package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;
//import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Aleksey", "Vladikin", (byte) 34);
        userDaoHibernate.saveUser("Aleksey", "Vladikin", (byte) 34);
        userDaoHibernate.saveUser("Aleksey", "Vladikin", (byte) 34);
        List<User> users = userDaoHibernate.getAllUsers();
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();

//        userDaoHibernate.dropUsersTable();


//        UserServiceImpl userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.saveUser("Anna", "Petrova", (byte) 23);
//        userService.saveUser("Sveta", "Ivanova", (byte) 24);
//        userService.saveUser("Slava", "Setchin", (byte) 32);
//        userService.saveUser("Aleksey", "Vladykin", (byte) 35);
//        userService.getAllUsers();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();

    }
}
