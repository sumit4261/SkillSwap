package in.skillswap.SkillSwap.dto;

import in.skillswap.SkillSwap.model.enums.SkillLevel;
import in.skillswap.SkillSwap.model.enums.SkillType;

public class UserSkillResponseDto {

    private Long id;
    private Long skillId;
    private String skillName;
    private SkillType type;
    private SkillLevel level;

    public UserSkillResponseDto(
            Long id,
            Long skillId,
            String skillName,
            SkillType type,
            SkillLevel level
    ){
        this.id = id;
        this.skillId = skillId;
        this.skillName = skillName;
        this.type = type;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public SkillType getType() {
        return type;
    }

    public void setType(SkillType type) {
        this.type = type;
    }

    public SkillLevel getLevel() {
        return level;
    }

    public void setLevel(SkillLevel level) {
        this.level = level;
    }
}
