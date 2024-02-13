package com.example.membershipservice.membership.application.port.in;

import com.example.membershipservice.membership.domain.Membership;

import java.lang.reflect.Member;

public interface ModifyMembershipUseCase {
    Membership modifyMembership(ModifyMembershipCommand command);
}
