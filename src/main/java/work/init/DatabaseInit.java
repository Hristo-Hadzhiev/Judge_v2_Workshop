package work.init;

import org.springframework.boot.CommandLineRunner;
import work.service.RoleService;

public class DatabaseInit implements CommandLineRunner {

    private final RoleService roleService;

    public DatabaseInit(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public void run(String... args) throws Exception {
        roleService.initRoles();
    }
}
