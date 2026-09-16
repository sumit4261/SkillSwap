package in.skillswap.SkillSwap.repository;

import in.skillswap.SkillSwap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
