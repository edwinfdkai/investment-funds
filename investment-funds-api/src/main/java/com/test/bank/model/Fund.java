package com.test.bank.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.math.BigDecimal;

@DynamoDbBean
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fund {

    private String fundId;
    private String name;
    private BigDecimal minAmount;
    private String categoria;

    @DynamoDbPartitionKey
    public String getFundId() {
        return fundId;
    }
}
