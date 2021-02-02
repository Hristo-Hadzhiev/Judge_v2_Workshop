package work.service;

import work.models.entity.Role;
import work.models.entity.RoleNameEnum;

public interface RoleService{

    void initRoles();

    Role findRole(RoleNameEnum roleNameEnum);
}
