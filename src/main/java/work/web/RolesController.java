package work.web;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import work.service.RoleService;
import work.service.UserService;


@Controller
@RequestMapping("/roles")
public class RolesController {

    private final RoleService roleService;
    private final UserService userService;
    private final ModelMapper modelMapper;

    public RolesController(RoleService roleService, UserService userService, ModelMapper modelMapper) {
        this.roleService = roleService;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }


//


}
