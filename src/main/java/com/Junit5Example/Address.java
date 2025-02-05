package com.Junit5Example;

import lombok.*;

@EqualsAndHashCode
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String city;
}
