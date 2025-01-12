package pl.futurejava;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor

public class User {

   @NonNull private String name;
   private int age;


}
