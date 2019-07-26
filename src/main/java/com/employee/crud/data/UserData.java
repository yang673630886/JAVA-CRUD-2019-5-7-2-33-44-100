package com.employee.crud.data;


import com.employee.crud.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    public static List<User> userData() {
        List<User> userList = new ArrayList<>();
        User user0 = new User(0, "小明", 20, "男");
        User user1 = new User(1, "小红", 19, "女");
        User user2 = new User(2, "小智", 15, "男");
        User user3 = new User(3, "小钢", 16, "女");
        User user4 = new User(4, "小夏", 15, "女");

        userList.add(user0);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        return userList;

    }

}
