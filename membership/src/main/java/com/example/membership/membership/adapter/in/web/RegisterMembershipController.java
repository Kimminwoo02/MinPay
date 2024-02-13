package com.example.membershipservice.membership.adapter.in.web;

import com.example.membershipservice.membership.application.port.in.RegisterMembershipCommand;
import com.example.membershipservice.membership.application.port.in.RegisterMembershipUseCase;
import com.example.membershipservice.common.WebAdapter;
import com.example.membershipservice.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// webAdapter
@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterMembershipController {

    private final RegisterMembershipUseCase registerMembershipUseCase;

    @PostMapping("/membership/register/")
    Membership registerMembership(@RequestBody RegisterMembershipRequest request){
        // request~~~

        // request -> Command

        //useCase ~~ (request)

        RegisterMembershipCommand command = RegisterMembershipCommand.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .isValid(true)
                .isCorp(request.getIsCorp())
                .build();


        return registerMembershipUseCase.registerMembership(command);
    }



}
