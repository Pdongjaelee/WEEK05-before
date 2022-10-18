package com.sparta.post03.controller;

import com.sparta.post03.dto.request.CommentRequestDto;
import com.sparta.post03.dto.request.PostRequestDto;
import com.sparta.post03.dto.response.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private CommentController commentService;

    //댓글 작성
    @PostMapping("/api/auth/comment")
    public ResponseDto<?> createComment(@RequestBody CommentRequestDto commentRequestDto, HttpServletRequest request){
        return commentService.createComment(commentRequestDto, request);
    }

}
