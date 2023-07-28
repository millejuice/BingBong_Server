package com.bingbong.consult.stomp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApplyRequest {
    private Long memberId;
    private String subject;
    private int status;
    private String type;
}
