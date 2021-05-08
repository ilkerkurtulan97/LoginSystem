import java.util.ArrayList;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GAuthConnect;
import core.GAuthService;
import dataAccess.concretes.LoginUser;
import entities.concretes.User;


public class Main {
    public static void main(String[] args){

        ArrayList<User> users = new ArrayList<>();
        UserService userService = new UserManager(new LoginUser(users), new GAuthConnect());
        User user = new User(1, "ilker", "kurtulan", "ikurtulan@gmail.com", "01234567");
        userService.register(user);
        userService.verify(user);
        userService.login(user);
        users.add(user);
        userService.registerWithGoogleAccount("ilker.kurtulan@gmail.com", "1234512345");



    }
}
