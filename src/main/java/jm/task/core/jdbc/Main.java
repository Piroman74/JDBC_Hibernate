package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Anna", "Petrova", (byte) 23);
        userService.saveUser("Sveta", "Ivanova", (byte) 24);
        userService.saveUser("Slava", "Setchin", (byte) 32);
        userService.saveUser("Aleksey", "Vladykin", (byte) 35);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
