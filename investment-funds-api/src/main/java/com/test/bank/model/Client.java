package com.test.bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class Client {

    private String clientId;
    private String name;
    private String email;
    private String phone;
    private BigDecimal balance;
    private String notificationPreference;

    @DynamoDbPartitionKey
    public String getClientId() {
        return clientId;
    }
}
