package com.example.springbootangular.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponseDto {
    private String code;
    private String message;
    private List<JSONObject> data;
}
