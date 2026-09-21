package in.skillswap.SkillSwap.controller;

import in.skillswap.SkillSwap.dto.SkillRequestDto;
import in.skillswap.SkillSwap.dto.SkillResponseDto;
import in.skillswap.SkillSwap.service.SkillService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService){
        this.skillService = skillService;
    }

    @PostMapping
    public ResponseEntity<SkillResponseDto> createSkill(
           @Valid @RequestBody SkillRequestDto request
    ){
        SkillResponseDto response = skillService.createSkill(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping
    public ResponseEntity<List<SkillResponseDto>> getAllSkills() {

        List<SkillResponseDto> skills =
                skillService.getAllSkills();

        return ResponseEntity.ok(skills);
    }
}
