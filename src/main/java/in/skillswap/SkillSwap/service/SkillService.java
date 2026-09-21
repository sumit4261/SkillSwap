package in.skillswap.SkillSwap.service;

import in.skillswap.SkillSwap.dto.SkillRequestDto;
import in.skillswap.SkillSwap.dto.SkillResponseDto;
import in.skillswap.SkillSwap.exception.DuplicateSkillException;
import in.skillswap.SkillSwap.model.Skill;
import in.skillswap.SkillSwap.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    public final SkillRepository skillRepository;

    public SkillService(
            SkillRepository skillRepository
    ){
        this.skillRepository = skillRepository;
    }

    public SkillResponseDto createSkill(SkillRequestDto skillRequestDto){

        //Check Duplicate skills
        if(skillRepository.findByName(skillRequestDto.getName()).isPresent()){
            throw new DuplicateSkillException("Skill already exists");
        }

        //DTO -> Entity
        Skill skill = new Skill();

        skill.setName(skillRequestDto.getName());
        skill.setDescription(skillRequestDto.getDescription());

        //save
        Skill savedSkill = skillRepository.save(skill);

        //Entity -> Response DTO
        return new SkillResponseDto(
                savedSkill.getId(),
                savedSkill.getName(),
                savedSkill.getDescription()
        );
    }

    public List<SkillResponseDto> getAllSkills(){

        List<Skill> skills = skillRepository.findAll();

        return skills.stream()
                .map(skill -> new SkillResponseDto(
                        skill.getId(),
                        skill.getName(),
                        skill.getDescription()
                )).toList();
    }
}
