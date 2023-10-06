package com.xl1.fsuserinfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserDTO {
    private Long id;
    private String userName;
    private String userPassword;
    private String address;
    private String city;
}
