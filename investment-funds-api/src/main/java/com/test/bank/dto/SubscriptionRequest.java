package com.test.bank.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SubscriptionRequest {

    @NotBlank
    private String clientId;

    @NotBlank
    private String fundId;

    @DecimalMin(value = "0.01", inclusive = true, message = "amount must be greater than 0")
    private BigDecimal amount;
}
