package com.example.stroyopttorg.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductDTO {
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private String imageUrl;
}
