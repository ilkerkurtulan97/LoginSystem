package business.abstracts;

import entities.concretes.User;

public interface UserService {
    void register(User user);

    void verify(User user);

    void login(User user);

    void registerWithGoogleAccount(String email, String password);

    User getEmail(String mail);

}
