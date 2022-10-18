package com.sparta.post03.controller;

import com.sparta.post03.dto.request.CommentRequestDto;
import com.sparta.post03.dto.response.CommentResponseDto;
import com.sparta.post03.dto.response.ResponseDto;
import com.sparta.post03.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    //댓글 작성
    @PostMapping("/api/auth/comment")
    public ResponseDto<?> createComment(@RequestBody CommentRequestDto commentRequestDto, HttpServletRequest request){
        return commentService.createComment(commentRequestDto, request);
    }
    //댓글 조회
    @GetMapping("/api/comment")
    public ResponseDto<?> getAllComment(){
        return commentService.getAllComment();
    }


    //댓글 상세 조회
    @GetMapping("api/comment/{id}")
    public ResponseDto<?> getComment(@PathVariable Long id){
        return commentService.getComment(id);
    }

}
