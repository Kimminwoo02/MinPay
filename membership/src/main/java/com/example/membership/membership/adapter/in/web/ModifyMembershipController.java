package com.example.membershipservice.membership.adapter.in.web;

import com.example.membershipservice.common.WebAdapter;
import com.example.membershipservice.membership.application.port.in.ModifyMembershipCommand;
import com.example.membershipservice.membership.application.port.in.ModifyMembershipUseCase;
import com.example.membershipservice.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class ModifyMembershipController {
  private final ModifyMembershipUseCase modifyMembershipUseCase;

  @PostMapping("/membership/modify/{membershipId}")
    ResponseEntity<Membership> modifyMembershipId(@RequestBody ModifyMembershipRequest request){

      ModifyMembershipCommand command = ModifyMembershipCommand.builder()
              .membershipId(request.getMembershipId())
              .name(request.getName())
              .address(request.getAddress())
              .email(request.getEmail())
              .isValid(request.isValid())
              .isCorp(request.isCorp())
              .build();
      return ResponseEntity.ok(modifyMembershipUseCase.modifyMembership(command));

  }

}
