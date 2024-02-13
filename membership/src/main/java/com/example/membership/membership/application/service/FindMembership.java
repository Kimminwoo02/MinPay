//package com.example.membershipservice.membership.application.service;
//
//import com.example.membershipservice.common.UseCase;
//import com.example.membershipservice.membership.application.port.in.FindMembershipCommand;
//import com.example.membershipservice.membership.application.port.in.FindMembershipUseCase;
//import com.example.membershipservice.membership.domain.Membership;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
//
//@RequiredArgsConstructor
//@UseCase
//@Transactional
//public class FindMembership implements FindMembershipUseCase {
//    private final FindMembershipPort fport;
//    private final QueryGateway queryGateway;
//    @Override
//    public Membership findMembership(FindMembershipCommand command) {
//        return fport.findMembership(new Membership.MembershipId(command.getMembershipId()));
//    }
//
//    @Override
//    public Membership findAxonMembership(FindMembershipCommand command) {
//        FindMembershipQuery getQuery = new FindMembershipQuery(command.getMembershipId());
//        queryGateway.query(getQuery, ResponseTypes.inse)
//    }
//}
