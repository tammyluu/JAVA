package org.example.models;

import lombok.*;

@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)//adresse mémoire
public class Person {
    @Getter
    @Setter
    @NonNull

    private  int id;

     @Setter
     @EqualsAndHashCode.Include // comparer les propriétés dans objet
    private  String firstName;

     @Setter
     @EqualsAndHashCode.Include
    private  String lastname;

}
