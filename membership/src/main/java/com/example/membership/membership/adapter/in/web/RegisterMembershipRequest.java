package com.example.membershipservice.membership.adapter.in.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterMembershipRequest {

    private String name;
    private String address;
    private String email;
    private Boolean isCorp;


}
