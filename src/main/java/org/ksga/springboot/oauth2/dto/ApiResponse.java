package org.ksga.springboot.oauth2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ApiResponse {
    private boolean success;
    private String message;
}
