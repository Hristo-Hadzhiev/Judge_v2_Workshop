package work.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import work.models.entity.RoleNameEnum;
import work.models.entity.User;
import work.models.service.UserServiceModel;
import work.repository.UserRepository;
import work.service.RoleService;
import work.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleService roleService;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, RoleService roleService) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.roleService = roleService;
    }


    @Override
    public void registerUser(UserServiceModel userServiceModel) {

        User user = this.modelMapper
                .map(userServiceModel, User.class);
        user.setRole(roleService.findRole(RoleNameEnum.USER));

        userRepository.save(user);
    }

    @Override
    public UserServiceModel findUserByNameAndPassword(String username, String password) {

        return userRepository
                .findByUsernameAndPassword(username, password)
                .map(user -> modelMapper.map(user, UserServiceModel.class))
                .orElse(null);
    }
}
