package cat.xtec.ioc.geronimo.repository;

import cat.xtec.ioc.geronimo.model.ERole;
import cat.xtec.ioc.geronimo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);

}
