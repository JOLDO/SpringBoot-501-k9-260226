package com.busanit501.springboot0226.repository.search;

import com.busanit501.springboot0226.domain.Board;
import com.busanit501.springboot0226.domain.QBoard;
import com.querydsl.jpa.JPQLQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class BoardSearchImpl extends QuerydslRepositorySupport implements BoardSearch{

    public BoardSearchImpl() {
        super(Board.class);
    }

    @Override
    public Page<Board> search1(Pageable pageable) {
        // 자바 문법으로, 검색 및 필터에 필요한 문장을 작성.(SQL 대신에, 자바 코드로 작성.), 빌더 패턴을 이용해서요.

        QBoard board  = QBoard.board; // Q 도메인 객체를 이용

        JPQLQuery<Board> query = from(board); // select .. from board

        query.where(board.title.contains("t")); // where title like..

        List<Board> list = query.fetch(); // DB 서버로 호출해서, 데이터를 받아오기.
        long count = query.fetchCount(); // 조회된 데이터 갯수 확인.

        return null;
    }
}
