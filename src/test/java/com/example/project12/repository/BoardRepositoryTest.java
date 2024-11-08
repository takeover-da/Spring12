package com.example.project12.repository;

import com.example.project12.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class BoardRepositoryTest {

  @Autowired  //스프링 컨테이너 안에서 repository빈을 꺼내옴
  BoardRepository repository;

  @Test
  public void 빈확인() {
    System.out.println("repository: " + repository);
  }

  @Test
  public void 게시물등록() {

    Board board = Board.builder()
        .title("안녕")
        .content("안녕하세요")
        .writer("둘리")
        .build();

    // save: insert 또는 update 기능이 실행됨
    repository.save(board);
  }

  @Test
  public void 목록조회() {

   List<Board> list = repository.findAll();

   for (Board b : list) {
     System.out.println(b);
   }
  }

  @Test
  public void 상세조회() {

    // 상세조회/단건조회
    Optional<Board> optional = repository.findById(2);

    // optional 안에 값이 있다면
    if (optional.isPresent() == true) {
      Board board = optional.get();
      System.out.println(board);
    }
  }

  @Test
  public void 수정() {

    Optional<Board> optional = repository.findById(2);

    if (optional.isPresent()) {
      Board board = optional.get();
      board.setContent("하이!");
      repository.save(board);
    }
  }

  @Test
  public void 삭제() {
    Optional<Board> optional = repository.findById(1);

    if (optional.isPresent()) {
      repository.deleteById(1);
    }
  }


}
