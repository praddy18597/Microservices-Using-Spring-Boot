package com.dailycodebuffer.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Long departmentId;     // we don't need to create entity, id and generated value annotation.
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
