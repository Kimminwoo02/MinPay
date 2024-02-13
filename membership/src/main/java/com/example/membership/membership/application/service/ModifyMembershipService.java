package com.example.membershipservice.membership.application.service;

import com.example.membershipservice.common.UseCase;
import com.example.membershipservice.membership.adapter.out.persistence.MembershipJpaEntity;
import com.example.membershipservice.membership.adapter.out.persistence.MembershipMapper;
import com.example.membershipservice.membership.application.port.in.ModifyMembershipCommand;
import com.example.membershipservice.membership.application.port.in.ModifyMembershipUseCase;
import com.example.membershipservice.membership.application.port.out.ModifyMembershipPort;
import com.example.membershipservice.membership.application.port.out.RegisterMembershipPort;
import com.example.membershipservice.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@UseCase
@RequiredArgsConstructor
@Transactional
public class ModifyMembershipService implements ModifyMembershipUseCase {

    private final ModifyMembershipPort modifyMembershipPort;
    private final MembershipMapper membershipMapper;

    @Override
    public Membership modifyMembership(ModifyMembershipCommand command) {
        modifyMembershipPort.modifyMembership(
                new Membership.MembershipId(command.getMembershipId()),
                new Membership.MembershipName(command.getName()),
                new Membership.MembershipEmail(command.getEmail()),
                new Membership.MembershipAddress(command.getAddress()),
                new Membership.MembershipIsCorp(command.isCorp()),
                new Membership.MembershipIsValid(command.isValid())
        );
        return null;
                //membershipMapper.mapToDomainEntity(jpaEntity);
    }
}
