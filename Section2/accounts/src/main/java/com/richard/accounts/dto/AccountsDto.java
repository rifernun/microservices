package com.richard.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(name = "Accounts", description = "Schema to hold Account information")
public class AccountsDto {

    @NotNull(message = "Account number cannot be null")
    @Schema(description = "Account Number of Eazy Bank account", example = "32781232")
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be empty")
    @Schema(description = "Account Type of Eazy Bank account", example = "Savings")
    private String accountType;

    @NotEmpty(message = "Branch Address cannot be empty")
    @Schema(description = "Eazy Bank branch address", example = "123 new york")
    private String branchAddress;
}
