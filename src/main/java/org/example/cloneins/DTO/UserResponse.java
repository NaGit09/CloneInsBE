package org.example.cloneins.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserResponse {
    private  Long user_id;
    private String full_name;
    private String profile_picture;
    private String bio;

    public UserResponse(Long user_id, String full_name, String profile_picture, String bio) {
        this.user_id = user_id;
        this.full_name = full_name;
        this.profile_picture = profile_picture;
        this.bio = bio;
    }

}
