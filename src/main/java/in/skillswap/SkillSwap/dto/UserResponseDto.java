package in.skillswap.SkillSwap.dto;

public class UserResponseDto {

    private Long id;
    private String name;
    private String email;
    private String location;
    private String bio;

    public UserResponseDto(
            Long id,
            String name,
            String email,
            String location,
            String bio
    ){
        this.id = id;
        this.name = name;
        this.email = email;
        this.location = location;
        this.bio = bio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
