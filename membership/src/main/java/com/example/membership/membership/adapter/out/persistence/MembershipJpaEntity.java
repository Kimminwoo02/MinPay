package com.example.membershipservice.membership.adapter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "membership")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MembershipJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long membershipId;

    private String name;
    private String address;
    private String email;
    private boolean isValid;
    private boolean isCorp;


    public MembershipJpaEntity(String name, String address, String email, boolean isValid, boolean isCorp) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.isValid = isValid;
        this.isCorp = isCorp;
    }
}
