package in.skillswap.SkillSwap.service;

import in.skillswap.SkillSwap.dto.UserRequestDto;
import in.skillswap.SkillSwap.dto.UserResponseDto;
import in.skillswap.SkillSwap.exception.DuplicateEmailException;
import in.skillswap.SkillSwap.model.User;
import in.skillswap.SkillSwap.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserResponseDto createUser(UserRequestDto userRequestDto){

        if(userRepository.findByEmail(userRequestDto.getEmail()).isPresent()){
            throw new DuplicateEmailException("Email Already registered");
        }

        User user = new User();

        user.setName(userRequestDto.getName());
        user.setEmail(userRequestDto.getEmail());
        user.setPassword(userRequestDto.getPassword());
        user.setLocation(userRequestDto.getLocation());
        user.setBio(userRequestDto.getBio());

        User savedUser = userRepository.save(user);

        return new UserResponseDto(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail(),
                savedUser.getLocation(),
                savedUser.getBio()
        );
    }

    public List<UserResponseDto> getAllUsers(){
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(user -> new UserResponseDto(
                        user.getId(),
                        user.getName(),
                        user.getEmail(),
                        user.getLocation(),
                        user.getBio()
                ))
                .toList();
    }
}
