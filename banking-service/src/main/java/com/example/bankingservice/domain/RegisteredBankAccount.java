package com.example.bankingservice.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisteredBankAccount {
    private final String registeredBankAccountId;
    private final String membershipId;
    private final String bankName; // enum
    private final String bankAccountNumber;
    private final boolean linkedStatusValid;

    public static RegisteredBankAccount geneateRegisteredBankAccount (
            RegisteredBankAccount.RegisteredBankAccountId registeredBankAccountId,
            RegisteredBankAccount.MembershipId membershipId,
            RegisteredBankAccount.BankName bankName,
            RegisteredBankAccount.BankAccountNumber bankAccountNumber,
            RegisteredBankAccount.LinkedStatusValid linkedStatusValid
    ){
        return new RegisteredBankAccount(
                registeredBankAccountId.registeredBankAccountId,
                membershipId.membershipId,
                bankName.bankName,
                bankAccountNumber.bankAccountNumber,
                linkedStatusValid.linkedStatusValid
        );
    }

    @Value
    public static class  RegisteredBankAccountId{
        public RegisteredBankAccountId(String value){
            this.registeredBankAccountId = value;
        }
        String registeredBankAccountId;
    }
    @Value
    public static class  MembershipId{
        public MembershipId(String value){
            this.membershipId = value;
        }
        String membershipId;
    }
    @Value
    public static class  BankName{
        public BankName(String value){
            this.bankName = value;
        }
        String bankName;
    }
    @Value
    public static class  BankAccountNumber{
        public BankAccountNumber(String value){
            this.bankAccountNumber = value;
        }
        String bankAccountNumber;
    }
    @Value
    public static class  LinkedStatusValid{
        public LinkedStatusValid(boolean value){
            this.linkedStatusValid = value;
        }
        boolean linkedStatusValid;
    }




}
