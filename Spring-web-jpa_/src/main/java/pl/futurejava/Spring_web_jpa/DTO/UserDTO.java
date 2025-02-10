package pl.futurejava.Spring_web_jpa.DTO;

import pl.futurejava.Spring_web_jpa.entity.User;

public class UserDTO {
    private Integer id;
    private String displayName;

    public UserDTO(Integer id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(), user.getDisplayName());
    }
}
