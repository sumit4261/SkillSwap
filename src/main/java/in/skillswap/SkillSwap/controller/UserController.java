package in.skillswap.SkillSwap.controller;

import in.skillswap.SkillSwap.dto.UserRequestDto;
import in.skillswap.SkillSwap.dto.UserResponseDto;
import in.skillswap.SkillSwap.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    ;
    private final UserService userService;

    public UserController(
            UserService userService
    ) {
        this.userService = userService;
    }

    // Get All Users
    @GetMapping
    public List<UserResponseDto> getAllUser() {
        return userService.getAllUsers();
    }

    // Create User
    @PostMapping
    public UserResponseDto createUser(
           @Valid @RequestBody UserRequestDto userRequestDto
    ) {

        UserResponseDto response =
                userService.createUser(userRequestDto);

        return response;
    }
}