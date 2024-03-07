package cat.xtec.ioc.geronimo.repository;

import cat.xtec.ioc.geronimo.model.RefreshToken;
import cat.xtec.ioc.geronimo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByUser(User user);

    Optional<RefreshToken> findByUserId(Long user_id);
}
