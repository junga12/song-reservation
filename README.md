# song-reservation

### 목적

노래 예약하기

---



1. 노래와 가수를 입력받는다.
2. - 입력받은 노래와 가수가 존재하면, 예약 리스트에 추가한다.
   - 존재하지 않으면, 알림 메시지를 주고, 예약 리스트에 아무것도 추가하지 않는다.
3. 



---

### 데이터베이스

| 테이블 이름 | 설명 |
| ----------- | ---- |
| music       | 노래 |
| artist      | 가수 |


- music table
  - id
  - music_name
  - artist

- artist table
  - id
  - artist_name
  - gender