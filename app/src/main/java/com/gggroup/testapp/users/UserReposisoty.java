package com.gggroup.testapp.users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabber on 30.05.18.
 */

public class UserReposisoty {

    private List<User> list;

    public UserReposisoty() {
        list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new User(i, 10, "user"));
        }
    }

    public  List<User> returnList(){
        return list;
    }


}
