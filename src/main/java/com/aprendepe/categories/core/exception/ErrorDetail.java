package com.aprendepe.categories.core.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor
public class ErrorDetail {
    private String details;
    private List<String> message;
}
