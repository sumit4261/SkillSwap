package in.skillswap.SkillSwap.service;

import in.skillswap.SkillSwap.repository.SkillRepository;
import in.skillswap.SkillSwap.repository.UserRepository;
import in.skillswap.SkillSwap.repository.UserSkillRepsoitory;
import org.springframework.stereotype.Service;

@Service
public class UserSkillService {

    private final UserSkillRepsoitory userSkillRepsoitory;
    private final UserRepository userRepository;
    private final SkillRepository skillRepository;

    public  UserSkillService(
            UserSkillRepsoitory userSkillRepsoitory,
            UserRepository userRepository,
            SkillRepository skillRepository
    ){
        this.userSkillRepsoitory = userSkillRepsoitory;
        this.userRepository = userRepository;
        this.skillRepository = skillRepository;
    }
}
