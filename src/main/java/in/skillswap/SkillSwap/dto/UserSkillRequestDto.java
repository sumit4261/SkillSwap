package in.skillswap.SkillSwap.dto;

import in.skillswap.SkillSwap.model.enums.SkillLevel;
import in.skillswap.SkillSwap.model.enums.SkillType;
import jakarta.validation.constraints.NotNull;

public class UserSkillRequestDto {

    @NotNull(message = "Skill ID is required")
    private Long skillId;

    @NotNull(message = "Skill type is required")
    private SkillType type;

    @NotNull(message = "Skill level is required")
    private SkillLevel level;

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
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
