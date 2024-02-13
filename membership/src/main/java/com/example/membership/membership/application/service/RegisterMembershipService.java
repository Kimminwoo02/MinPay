package com.example.membershipservice.membership.application.service;

import com.example.membershipservice.common.UseCase;
import com.example.membershipservice.membership.adapter.out.persistence.MembershipJpaEntity;
import com.example.membershipservice.membership.adapter.out.persistence.MembershipMapper;
import com.example.membershipservice.membership.application.port.in.RegisterMembershipCommand;
import com.example.membershipservice.membership.application.port.in.RegisterMembershipUseCase;
import com.example.membershipservice.membership.application.port.out.RegisterMembershipPort;
import com.example.membershipservice.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class RegisterMembershipService implements RegisterMembershipUseCase {
    private final RegisterMembershipPort registerMembershipPort;
    private final MembershipMapper membershipMapper;
    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {

       MembershipJpaEntity jpaEntity = registerMembershipPort.createMembership(
                new Membership.MembershipName(command.getName()),
                new Membership.MembershipEmail(command.getEmail()),
                new Membership.MembershipAddress(command.getAddress()),
                new Membership.MembershipIsValid(command.isValid()),
                new Membership.MembershipIsCorp(command.isCorp())
        );

        // entity -> Membership
        return membershipMapper.mapToDomainEntity(jpaEntity);




    }
}
