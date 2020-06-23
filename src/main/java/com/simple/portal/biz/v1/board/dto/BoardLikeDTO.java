package com.simple.portal.biz.v1.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardLikeDTO {

    @NotBlank(message="기본키는 필수 입력값입니다.")
    private Long id;
    @NotBlank(message="아이템구분은 필수 입력값입니다.")
    private String itemGb; // 아이템 구분 L:D

}
