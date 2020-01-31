package com.gamification.digigame.gameengine;

import java.util.ArrayList;
import java.util.List;

public class Persistance {

    private static Persistance persistance;

    private List<User> userList = new ArrayList<>();

    private Persistance() {
        User user01 = new User("user01", Constants.USERS.user01,true, Rules.TASKS_LIST.gettasksList());
        userList.add(user01);
        User user02 = new User("user02", Constants.USERS.user02, false,Rules.TASKS_LIST.gettasksList());
        userList.add(user02);
    }

    public static Persistance getInstance() {
        if (persistance == null) {
            persistance = new Persistance();
        }
        return persistance;
    }

    public User getUserDetails(int userId) {
        User user = null;
        for (User it : userList) {
            if (it.getUserId() == userId) {
                user = it;
                break;
            }
        }
        return user;
    }

}
