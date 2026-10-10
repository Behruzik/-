package com.example.stroyopttorg.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderDTO {
    private UserDTO user;
    private ProductDTO product;
    private Integer quantity;
    private Double totalPrice;
    private String status;
}
