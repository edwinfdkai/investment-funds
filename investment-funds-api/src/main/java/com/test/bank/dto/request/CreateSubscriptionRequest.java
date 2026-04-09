package com.test.bank.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateSubscriptionRequest {

    @NotBlank(message = "fundId must not be blank")
    private String fundId;

    @DecimalMin(value = "0.01", inclusive = true, message = "amount must be greater than 0")
    private BigDecimal amount;
}
