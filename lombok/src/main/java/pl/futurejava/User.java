package pl.futurejava;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
@Value
public class User extends BaseClassForUser {

   String name;
   int age;


}
