package ge.ucha.myApBootDockerApp.Test;

import ge.ucha.myApBootDockerApp.model.User;

import java.util.List;

public class MyTestClass {

    public void myTest(List<User> list) {
        assert (list.size() > 5);
    }
}
