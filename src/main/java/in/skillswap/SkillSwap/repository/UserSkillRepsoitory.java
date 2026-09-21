package in.skillswap.SkillSwap.repository;

import in.skillswap.SkillSwap.model.UserSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSkillRepsoitory extends JpaRepository<UserSkill, Long> {

    List<UserSkill> findByUserId(Long userId);
}
