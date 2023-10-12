package com.spring.boot.rest.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class OrderDetailDto {

    private UUID orderDetailId;
    private String ieOrderId;
    private String srcOrderId;
}
