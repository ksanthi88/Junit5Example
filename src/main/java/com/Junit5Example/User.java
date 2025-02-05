package com.Junit5Example;

import lombok.*;

@EqualsAndHashCode
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Address address;
}
