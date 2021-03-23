# C-it
![image](https://user-images.githubusercontent.com/54854166/108254372-47e69f80-719e-11eb-880a-b3624cd8b9f6.png)

## 1조 소개
백엔드: 장은선(팀장), 김혜원, 김효신  
프론트: 문서영, 이초롱  

## 프로젝트 소개
IT 취준생을 위한 IT 뉴스 커뮤니티
**C-it**은 개발자를 꿈꾸는 이들에게 **it 업계의 각종 최신 소식과 인터뷰를 실시간으로 전달**하고 **소통의 장을 마련**하고자 합니다. 
😊 웃는 모습의 로고처럼 언제나 사용자와 같은 자리에서 it 업계를 바라보겠습니다.

## 사용 기술
Java, Javascript, Jquery, HTML5, CSS3, JSP, Servlet, Ajax, Oracle, SQL, jstl/el/cos/fmt

## 개발 환경/ 사용 툴
### 프론트  
Git, Emit, VisualStudio

### 백앤드  
SQL developer/ Eclipse/ Tomcat

### 브라우저 서포트
Internet Explorer 10, Chrome, Firefox에서 지원합니다.

### 사용 가능 디바이스
PC(1279px), 모바일(768px)

### ERD  
![ERD](https://user-images.githubusercontent.com/54854166/108317372-819cc200-7201-11eb-899b-e46f02cd463d.png)


## 기능(PC용 화면)
### 메인
C-it의 메인 화면으로 헤더 좌측엔 공지사항, 뉴스, 자유게시판, 밋업
우측엔 회원가입/로그인, 로그아웃/마이페이지 메뉴가 있습니다.  
![메인](https://user-images.githubusercontent.com/54854166/108248576-65fcd180-7197-11eb-91f4-34c71c9003a6.png)

### 회원가입 
아이디 조건이 맞지 않을 경우 입력란 아래 경고 메시지가 나타나며 조건에 맞으면 해당 조건을 충족했다는 메시지가 뜹니다.  
아이디 중복 확인 후엔 버튼 색이 초록색으로 바뀝니다.  
이메일 인증 버튼 클릭 시 사용자 이메일로 인증 번호가 전송되어 입력 시 인증 가능합니다.  
![회원가입](https://user-images.githubusercontent.com/54854166/108235339-131c1d80-7189-11eb-930c-74c59e39548c.png)

### 로그인 
아이디와 비밀번호 입력 시 로그인이 가능합니다.
![로그인](https://user-images.githubusercontent.com/54854166/108235457-2c24ce80-7189-11eb-87ce-9ab26c8be0ce.png)

### 아이디 찾기
회원 사용자가 가입 시 입력한 이름과 이메일을 통해 아이디 찾기가 가능합니다.
![아이디찾기](https://user-images.githubusercontent.com/54854166/108247700-5630bd80-7196-11eb-8105-7f1812756288.png)

### 비밀번호 찾기
회원 사용자가 가입 시 입력한 이름, 아이디, 이메일을 통해 아이디 찾기가 가능합니다.
![비밀번호찾기](https://user-images.githubusercontent.com/54854166/108248585-67c69500-7197-11eb-92fb-120b5167abfc.png)

### 비밀번호 찾기 성공
비밀번호 찾기 성공 시 화면
![비밀번호찾기성공](https://user-images.githubusercontent.com/54854166/108248591-68f7c200-7197-11eb-90c3-3b6d86b1159d.png)

### 비밀번호 찾기 실패
비밀번호 찾기 실패 시 화면
![비밀번호찾기실패](https://user-images.githubusercontent.com/54854166/108248594-6a28ef00-7197-11eb-9c5c-289d3bb63ff4.png)

-------------비밀번호 찾기 성공/실패 화면과 동일
### 아이디 찾기 성공
### 아이디 찾기 실패

### 마이페이지
회원정보수정 페이지로 이동 가능하며 Board에서 사용자가 작성한 게시글을 모아볼 수 있습니다.
![마이페이지](https://user-images.githubusercontent.com/54854166/108305672-df271380-71ed-11eb-9f49-c226035b8c16.png)

### 회원정보수정 및 탈퇴
비밀번호, 이메일 변경 및 회원 탈퇴가 가능합니다.
![정보수정](https://user-images.githubusercontent.com/54854166/108235421-25965700-7189-11eb-8035-d4c17d0560fc.png)

### 공지사항 메인
새 글 작성일 이후 6일 이하 시 new 아이콘이 좌측에 떠서 최신글을 쉽게 확인 가능합니다.
![공지사항메인](https://user-images.githubusercontent.com/54854166/108248569-64cba480-7197-11eb-97dd-1163318bad75.png)
+ 버튼 클릭 시 공지사항 내용 확인이 가능합니다.
+ ![공지사항확장](https://user-images.githubusercontent.com/54854166/108304754-07ae0e00-71ec-11eb-8db5-79c813ab5bb2.png)

등록된 공지사항이 없을 경우 메시지가 뜹니다.
![등록된게시물이없습니다](https://user-images.githubusercontent.com/54854166/108248567-639a7780-7197-11eb-8997-5e81e6331fb9.jpg)

-------------뉴스, 자유게시판 작성/
### 공지사항 작성
관리자 전용 화면으로 공지사항 작성이 가능합니다.
### 공지사항 수정
관리자 전용 화면으로 공지사항 수정이 가능합니다.

### ☝ News 뉴스 메인
C-it의 첫 번째 대표 서비스인 NEWS 페이지에서 전체, 채용, 기업, 인터뷰 등 각 카테고리를 클릭하면 해당 카테고리에 맞는 IT 업계 최근 기사에 접근 가능합니다.
![뉴스메인](https://user-images.githubusercontent.com/54854166/108235462-2d55fb80-7189-11eb-84a9-4d959bf81a08.png)

### 뉴스 보기 
NEWS 메뉴 상세 보기 페이지로 외부 매체 기사의 제목, 매체, 작성일, 조회수, 내용을 확인할 수 있습니다.
![뉴스보기](https://user-images.githubusercontent.com/54854166/108235446-2af3a180-7189-11eb-9133-be223cbed842.png)

### 뉴스 작성 
관리자 전용 화면으로 저작권에 위배되지 않는 여러 외부 매체 기사를 공유받아 게시합니다. 
카테고리 선택, 제목, 작성자, 원문 링크 입력이 가능합니다.
![뉴스작성](https://user-images.githubusercontent.com/54854166/108235455-2b8c3800-7189-11eb-9e2f-2bf94fa8f11a.png)

### 뉴스 수정
관리자 전용 화면으로 뉴스 수정이 가능합니다.
![뉴스수정](https://user-images.githubusercontent.com/54854166/108248589-685f2b80-7197-11eb-9e9f-6bb0865a948d.png)

### ✌ Board 자유게시판
C-it의 두 번째 대표 서비스로 주요 타깃 사용자인 개발자 지망생, it 업계 종사자, 학생 등이 로그인하여 자유롭게 글을 게시할 수 있습니다.
### 자유게시판 목록
새 글 작성일 6일 이하 시 new 아이콘이 좌측에 떠서 최신글을 쉽게 확인 가능합니다.
![자유게시판목록](https://user-images.githubusercontent.com/54854166/108250205-52eb0100-7199-11eb-8915-a298887d70b5.png)

### 자유게시판 보기
작성일, 작성자, 조회수 확인이 가능하며 스마트 에디터를 통해 간편하게 파일 업로드 및 글 작성을 할 수 있습니다.
![자유게시판보기](https://user-images.githubusercontent.com/54854166/108250198-51b9d400-7199-11eb-87c7-f88ca258da9b.png)

### 자유게시판 작성
사는 얘기, 고민, 면접 후기, 국비 교육, 스터디 모집의 5가지 카테고리를 선택해 글을 작성할 수 있습니다.
### 자유게시판 수정
글을 작성한 로그인 사용자는 자유게시판 수정이 가능합니다.

### 🤟 MeetUp 밋업 
C-it의 세 번째 대표 서비스로 각 월을 클릭하면 해당 월에 열리는 각종 IT 행사 및 모임 모아보기가 가능합니다.
![진행중인밋업이없습니다](https://user-images.githubusercontent.com/54854166/108248571-65fcd180-7197-11eb-855e-d50a00623844.png)

##모바일 화면  
###메인![뉴스메인](https://user-images.githubusercontent.com/54854166/108309059-35975080-71f4-11eb-9ec3-f186c19b3e5b.JPG)  
![m정보수정완료](https://user-images.githubusercontent.com/54854166/108309061-362fe700-71f4-11eb-9d20-74ea38fa0020.JPG)  
###뉴스 작성  
![뉴스작성](https://user-images.githubusercontent.com/54854166/108309053-33cd8d00-71f4-11eb-983f-6851c66b8685.JPG)  


