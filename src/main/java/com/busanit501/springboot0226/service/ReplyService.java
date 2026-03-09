package com.busanit501.springboot0226.service;

import com.busanit501.springboot0226.domain.Reply;
import com.busanit501.springboot0226.dto.ReplyDTO;

public interface ReplyService {
    Long register(ReplyDTO replyDTO);
    
    //조회
    ReplyDTO read(Long rno);
    //수정
    void modify(ReplyDTO replyDTO);
    //삭제
    void remove(Long rno);
}
