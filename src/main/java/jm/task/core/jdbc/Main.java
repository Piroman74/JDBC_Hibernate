package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

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
    }
}
