package pl.futurejava.SpringBootAppRepeat;

import com.fasterxml.jackson.annotation.JsonProperty;

public record User(
        @JsonProperty("id") int id,
        @JsonProperty("name") String name,
        @JsonProperty("age") int age,
        @JsonProperty("isMale") Boolean isMale) {
}
