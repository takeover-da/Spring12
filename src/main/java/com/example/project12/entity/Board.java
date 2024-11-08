package com.example.project12.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.concurrent.Callable;

// 엔티티: DB에 데이터를 담아서 전달하는 역할
// 테이블 구조와 같이 구성

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board extends BaseEntity {

  // PK + Auto Increament
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int no;

  // 컬럼의 정보: 길이 + Not Null
  @Column(length = 100, nullable = false)
  String title;  // 자료형 컬럼의 이름

  @Column(length = 1500, nullable = false)
  String content;

  @Column(length = 50, nullable = false)
  String writer;

}
