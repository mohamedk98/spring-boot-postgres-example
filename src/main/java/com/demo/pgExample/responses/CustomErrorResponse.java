package com.demo.pgExample.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class CustomErrorResponse {
    private int status;
    private String message;
    private long timestamp;
}
