package com.telran.java3h.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class PersonDTO {

    private Integer id;
    private String name;
    private String city;
    private String street;
    private String phoneNumber;
    private Integer children;
}
