package com.example.membershipservice.membership.application.port.out;

import com.example.membershipservice.membership.adapter.out.persistence.MembershipJpaEntity;
import com.example.membershipservice.membership.domain.Membership;

public interface ModifyMembershipPort {

    MembershipJpaEntity modifyMembership(

        Membership.MembershipId membershipId,
        Membership.MembershipName membershipName,
        Membership.MembershipEmail membershipEmail,
        Membership.MembershipAddress membershipAddress,
        Membership.MembershipIsCorp membershipIsCorp,
        Membership.MembershipIsValid membershipIsValid


    );
}
