package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService=new UserServiceImpl();
        userService.createUsersTable();
        System.out.println("Таблица создана");

        userService.saveUser("jhon","birchenko",(byte) 22);
        System.out.println("Джон добавлен в таблицу");
        userService.saveUser("maks","birchenko",(byte) 21);
        System.out.println("Макс добавлен в таблицу");
        userService.saveUser("pashok","birchenko",(byte) 23);
        System.out.println("Пашок добавлен в таблицу");
        userService.saveUser("sashok","birchenko",(byte) 24);
        System.out.println("Сашок добавлен в таблицу");
        System.out.print(" Получили пользователей : ");

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();
        System.out.println("Очистили колонки юзеров");


        userService.dropUsersTable();
        System.out.println("Удалили таблицу");
    }
}
