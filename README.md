# FastLMS 프로젝트

Spring Boot 2.5.4와 MariaDB를 사용한 학습 관리 시스템 플랫폼입니다.

## 기술 스택

- **Backend**: Spring Boot 2.5.4, Java 8
- **Database**: MariaDB
- **Template Engine**: Thymeleaf
- **Build Tool**: Maven

## 데이터베이스 구조 (ERD)

이 프로젝트의 데이터베이스 구조는 다음과 같습니다.


[![](https://mermaid.ink/img/pako:eNp9VMtum0AU_RU0ayeKa0wMuyRmEVVxrTTdVJaia7jGU8MMmrmooY73lbrIKlKXXXaRSlU_q3L-oQO2Y_NIWXHPmXPui2HJAhki8xiqIYdIQTIRlnmu_Ktz_9q6vz86kkvr5uytf3vx7sP1e9_yrAlbf_3-9_fj-tuP9Z9fE7ZRbOlXFM8PT8-PP4uzFf_lJioeTYqLyMIEeNxAM41qBAk2iHQuRQsKWn-WKtwQq13SbT0HSbkgK5CZ0ngZNlx4AhGOgeYNZoH53v4A19n0EwbUgicJqHyPE94ViQWhIF0tJ1U8wCqkIcZxFQ6BkHiCJeeLcEi1Xg8XUGuYYIEXjab_O4raVso6Ia_VtGuWgDJdK-f8bDSq7rvwmIIQqF4b_aWYyQZDnGJsH2TjbBDzYNG6QAIVId3kaetIDUtDE7VwaEZdYaZSxgjC4nosNWGzFYURN69wWN-LnSGrdltRIkM-46haJIbaS1aswyLFQ-aRyrDDElRmUyZk5aQnjOZobg0rrmAIalFcwEKTgvgoZbKTKZlFc-bNINYmytIi2fZ38IIq0zoq890IYl7XsUsT5i3ZHfN6vd5xt-8MbHdw4jjOqSFz5r3pHw9Obde1e12367i2s-qwL2XWE0P0V_8ApadhFQ?type=png)](https://mermaid.live/edit#pako:eNp9VMtum0AU_RU0ayeKa0wMuyRmEVVxrTTdVJaia7jGU8MMmrmooY73lbrIKlKXXXaRSlU_q3L-oQO2Y_NIWXHPmXPui2HJAhki8xiqIYdIQTIRlnmu_Ktz_9q6vz86kkvr5uytf3vx7sP1e9_yrAlbf_3-9_fj-tuP9Z9fE7ZRbOlXFM8PT8-PP4uzFf_lJioeTYqLyMIEeNxAM41qBAk2iHQuRQsKWn-WKtwQq13SbT0HSbkgK5CZ0ngZNlx4AhGOgeYNZoH53v4A19n0EwbUgicJqHyPE94ViQWhIF0tJ1U8wCqkIcZxFQ6BkHiCJeeLcEi1Xg8XUGuYYIEXjab_O4raVso6Ia_VtGuWgDJdK-f8bDSq7rvwmIIQqF4b_aWYyQZDnGJsH2TjbBDzYNG6QAIVId3kaetIDUtDE7VwaEZdYaZSxgjC4nosNWGzFYURN69wWN-LnSGrdltRIkM-46haJIbaS1aswyLFQ-aRyrDDElRmUyZk5aQnjOZobg0rrmAIalFcwEKTgvgoZbKTKZlFc-bNINYmytIi2fZ38IIq0zoq890IYl7XsUsT5i3ZHfN6vd5xt-8MbHdw4jjOqSFz5r3pHw9Obde1e12367i2s-qwL2XWE0P0V_8ApadhFQ)

## 테이블 설명

### 1. MEMBER (회원)

- 회원 정보를 관리하는 테이블
- 이메일을 기본키로 사용
- 이름, 휴대폰번호, 비밀번호 정보 포함

### 2. COURSE (강좌 정보)

- 온라인 강좌 정보를 관리하는 테이블
- 강좌 ID를 기본키로 사용
- 제목, 내용, 가격, 할인 정보 등 포함

### 3. TAKE_COURSE (수강정보)

- 회원과 강좌 간의 수강 관계를 관리하는 테이블
- 수강 ID를 기본키로 사용
- 결제금액, 수강상태 정보 포함
- MEMBER와 COURSE 테이블을 연결하는 조인 테이블

### 4. BANNER (배너)

- 웹사이트 배너 정보를 관리하는 테이블
- 배너 ID를 기본키로 사용
- 이미지, 제목, 내용, 게시 기간 등 포함

### 5. 구현
####  [ 회원 ]
- [x] 회원가입
- [x] 이메일로 승인메일 전송
- [x] 로그인
- [x] 로그아웃
- [x] 비밀번호 초기화
- [x] 비밀번호 재설정

#### [ 관리자 ]
- [ ] 관리자 로그인
- [ ] 회원관리 - 목록
- [ ] 회원관리 - 상세정보
- [ ] 회원관리 - 회원 상태 처리
- [ ] 강의관리 - 카테고리 관리(목록, 추가, 수정, 삭제)
- [ ] 강의관리 - 강의 목록
- [ ] 강의관리 - 상세 정보
- [ ] 강의관리 - 강의 등록
- [ ] 강의관리 - 강의 수정
- [ ] 강의관리 - 강의 삭제
