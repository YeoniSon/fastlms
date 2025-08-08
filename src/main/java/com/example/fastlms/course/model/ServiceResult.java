package com.example.fastlms.course.model;

import com.example.fastlms.admin.model.CommonParam;
import lombok.Data;

@Data
public class ServiceResult {

    boolean result;
    String message;

    public ServiceResult() {
    }

    public ServiceResult(boolean result, String message) {
        this.result = result;
        this.message = message;
    }

    public ServiceResult(boolean result) {
        this.result = result;
    }
}
