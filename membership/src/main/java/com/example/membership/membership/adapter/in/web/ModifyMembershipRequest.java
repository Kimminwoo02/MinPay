package com.example.membershipservice.membership.adapter.in.web;

import com.example.membershipservice.common.WebAdapter;
import com.example.membershipservice.membership.domain.Membership;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModifyMembershipRequest {
  private String membershipId;
  private String name;
  private String address;
  private String email;
  private boolean isValid;
  private boolean isCorp;


}
