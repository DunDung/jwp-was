# 웹 애플리케이션 서버

## 1단계

1. http://localhost:8080/index.html 로 접속했을 때 webapp 디렉토리의 index.html 파일을 읽어 클라이언트에 응답한다.
    - [x] Request Line에서 path 분리하기
    - [x] path에 해당하는 파일 읽어 응답하기
2. “회원가입” 메뉴를 클릭하면 http://localhost:8080/user/form.html 으로 이동하면서 회원가입할 수 있다. 회원가입을 하면 다음과 같은 형태로 사용자가 입력한 값이 서버에 전달된다.
    - [x] 요청별로 구별하는 기능
    - [x] Request Parameter 추출하기
        - [x] QueryString 추출하기
            - [x] QueryString 형식이 아닐 때 예외 처리
    - [x] inputData User로 변환하기
        - [x] 올바른 형식의 input Data가 아닐 때 예외 처리
3. http://localhost:8080/user/form.html 파일의 form 태그 method를 get에서 post로 수정한 후 회원가입 기능이 정상적으로 동작하도록 구현한다.
    - [x] Request Body의 값 추출하기
4. “회원가입”을 완료하면 /index.html 페이지로 redirect 방식처럼 이동한다.
5. 지금까지 구현한 소스 코드는 stylesheet 파일을 지원하지 못하고 있다. Stylesheet 파일을 지원하도록 구현하도록 한다.
