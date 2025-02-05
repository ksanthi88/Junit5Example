package com.Junit5Example;

import lombok.*;

@EqualsAndHashCode
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String productName;
    private double productPrice;
}
