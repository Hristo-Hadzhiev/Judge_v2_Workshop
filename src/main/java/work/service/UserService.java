package work.service;

import work.models.service.UserServiceModel;

public interface UserService {

    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findUserByNameAndPassword(String username, String password);
}
