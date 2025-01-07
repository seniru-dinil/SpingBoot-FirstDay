package edu.icet.ecom.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Product {
    private String name;
    private String vendor;
    private Double price;
}
