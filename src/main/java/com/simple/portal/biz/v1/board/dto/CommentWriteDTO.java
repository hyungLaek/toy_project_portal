package com.simple.portal.biz.v1.board.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentWriteDTO {
//    @NotNull(message = "Please enter id")
//    private Long id; // 아이디

    @NotNull(message="게시판 기본키는 필수 입력값입니다.")
    private Long boardId; // 게시글 아이디

    @NotNull(message="제목은 필수 입력값입니다.")
    private String title; // 제목

    @NotNull(message="내용은 필수 입력값입니다.")
    private String content; // 내용

    @NotNull(message="아이디는 필수 입력값입니다.")
    private String writer; // 글쓴이


}
