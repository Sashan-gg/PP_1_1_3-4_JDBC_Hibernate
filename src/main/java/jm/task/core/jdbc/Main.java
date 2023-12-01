package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Billy", "Harrington", (byte) 33);
        userService.saveUser("Van", "Darkholme", (byte) 30);
        userService.saveUser("Mark", "Wolf", (byte) 29);
        userService.saveUser("Boy", "NextDoor", (byte) 30);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
