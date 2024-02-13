package com.example.membershipservice.membership.adapter.in.web;

import com.example.membershipservice.common.WebAdapter;
import com.example.membershipservice.membership.application.port.in.FindMembershipCommand;
import com.example.membershipservice.membership.application.port.in.FindMembershipUseCase;
import com.example.membershipservice.membership.domain.Membership;
import io.swagger.models.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class FindMembershipController {
  private final FindMembershipUseCase findMembershipUseCase;

  @GetMapping("/membership/{membershipId}")
    ResponseEntity<Membership> findMembershipByMemberId(@PathVariable String membershipId){

    FindMembershipCommand command = FindMembershipCommand.builder()
              .membershipId(membershipId)
              .build();
      return ResponseEntity.ok(findMembershipUseCase.findMembership(command));
  }

  @GetMapping(path = "/membership/axon/{memebershipId}")
  ResponseEntity<Membership> findAxonMembershipByMemberId(@PathVariable String membershipId) {
    FindMembershipCommand command = FindMembershipCommand.builder()
            .membershipId(membershipId)
            .build();

    return ResponseEntity.ok(findMembershipUseCase.findAxonMembership(command));
  }

}
