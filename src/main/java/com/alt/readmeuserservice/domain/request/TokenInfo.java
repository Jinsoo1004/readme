package com.alt.readmeuserservice.domain.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenInfo {
    private String access;
    private String refresh;
}