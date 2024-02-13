package com.example.membershipservice.membership.application.port.in;

import com.example.membershipservice.membership.domain.Membership;

public interface FindMembershipUseCase {
    Membership findMembership(FindMembershipCommand command);
    Membership findAxonMembership(FindMembershipCommand command);
}
