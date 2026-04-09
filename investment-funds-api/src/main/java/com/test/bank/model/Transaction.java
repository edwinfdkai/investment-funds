package com.test.bank.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.math.BigDecimal;
import java.time.LocalDate;

@DynamoDbBean
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private String transactionId;
    private String clientId;
    private String fundId;
    private String type;
    private BigDecimal amount;
    private LocalDate date;

    @DynamoDbPartitionKey
    public String getTransactionId() {
        return transactionId;
    }
}
