package com.example.fastlms.course.dto;

import com.example.fastlms.course.entity.TakeCourse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TakeCourseDto {
    long id;

    long courseId;
    String userId;

    long payPrice;
    String status;

    LocalDateTime regDt;

    //JOIN
    String userName;
    String phone;
    String subject;

    //추가 컬럼
    long totalCount;
    long seq;

    public String getRegDtText() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return regDt != null ? regDt.format(formatter) : "";

    }

    public static TakeCourseDto of(TakeCourse x) {
        return TakeCourseDto.builder()
                .id(x.getId())
                .courseId(x.getCourseId())
                .userId(x.getUserId())

                .payPrice(x.getPayPrice())
                .status(x.getStatus())

                .regDt(x.getRegDt())
                .build();
    }

}
