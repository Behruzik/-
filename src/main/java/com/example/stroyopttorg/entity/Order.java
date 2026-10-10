package com.example.stroyopttorg.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Order {
    private Long id;
    private User user;
    private Product product;
    private Integer quantity;
    private Double totalPrice;
    private String status;
}
