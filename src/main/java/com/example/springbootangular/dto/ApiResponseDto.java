package com.example.springbootangular.dto;

import lombok.*;
import org.json.JSONObject;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ApiResponseDto<T> {
    private String code;
    private String message;
    private T data;
}
