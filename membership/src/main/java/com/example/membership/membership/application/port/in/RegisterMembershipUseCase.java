package com.example.membershipservice.membership.application.port.in;


import com.example.membershipservice.membership.domain.Membership;


public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);

}
