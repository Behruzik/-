package com.example.stroyopttorg.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO {
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private String role;
}
