package pl.futurejava.Spring_web_jpa.DTO;

public class PostDTO {
    private Integer id;
    private String body;
    private UserDTO user;

    public PostDTO(Integer id, String body, UserDTO user) {
        this.id = id;
        this.body = body;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
