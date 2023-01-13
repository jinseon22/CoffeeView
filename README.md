<h1 align="center">☕ 커피뷰(CoffeeView): 커피 리뷰 사이트</h1>

<br>

## 📄 개요
개인 프로젝트로 진행 중인 커피 리뷰 사이트입니다.

평소에 커피를 좋아해서 매일 마시는 습관이 있습니다. 특히 간편한 점이 좋아 커피믹스나 편의점 커피를 자주 마십니다. 가끔 편의점에 가다 보면, 새로운 커피가 자주 보이고 종류가 많다는 것을 느꼈습니다. 그러다 보니 지난번에 마셨던 커피가 무엇이었는지, 어떤 맛이었는지 헷갈리기 시작했습니다. 생각해보면 편의점 커피뿐만 아니라 카페에서 한 번 마셔본 커피, 궁금해서 사 본 커피믹스 등 잊어버린 맛이 많았습니다. 얼핏 보기엔 비슷한 커피들이지만 은은한 달콤함이 기분 좋았던 커피, 자극적으로 달고 짠 커피 등 한 잔을 마신 후 떠오르는 느낌을 기록으로 남겨두고 싶어서 프로젝트로 주제로 선정했습니다.

혼자 프로젝트를 진행하면서, 이전의 팀 프로젝트에서 담당하지 않았던 기능들을 만들어보고 싶었습니다. HTML과 CSS를 시작으로, 로그인과 게시판 등 일반적인 사이트 수준의 기능 구현을 목표로 시작했습니다. 프로젝트 진행 시 테스트 코드를 활용하려 노력했고, 막히는 부분에선 공부를 병행하며 제작 중입니다.

<br>

## 📅 기간
2022.11.13. ~ 진행 중

<br>

## 🛠 개발환경
#### Front-End
<p>
<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white"> 
<img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white"> 
<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=javascript&logoColor=black">
</p>

#### Back-End
<p>
<img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/jQuery-0769AD?style=flat-square&logo=jquery&logoColor=white">
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/JUnit5-25A162?style=flat-square&logo=JUnit5&logoColor=white">

</p>

#### Database
<img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white"> 

#### Server
<img src="https://img.shields.io/badge/Apache Tomcat-F8DC75?style=flat-square&logo=apachetomcat&logoColor=black">

<br>

## 📚 DB ERD
<img src="https://github.com/jinseon22/CoffeeView/raw/main/src/main/resources/static/img/readme/ERD.png">

<br>

## 🔍 주요 기능 (제작 중)
<img src="https://github.com/jinseon22/CoffeeView/raw/main/src/main/resources/static/img/readme/index.png">

- 화면 상단에서 로그인 정보에 따라 비회원, 회원, 관리자를 구분하여 다른 메뉴를 제공합니다.
- 하단에서 리뷰 평점이 높은 커피와 새로 추가된 커피를 간략히 확인할 수 있습니다.

<br>

<img src="https://github.com/jinseon22/CoffeeView/raw/main/src/main/resources/static/img/readme/join.png">

- 회원가입 시 Ajax를 통해 이메일과 닉네임 중복검사를 진행합니다.
- 이메일 인증에 Gmail API를 사용했습니다.
- JavaScript로 유효성 검사를 시행하여 입력 항목을 확인합니다.

<br>

<img src="https://github.com/jinseon22/CoffeeView/raw/main/src/main/resources/static/img/readme/list.png">

- 커피 목록에서 커피 클릭 시 상세 정보와 리뷰를 볼 수 있습니다.
- 카테고리별 선택을 통한 검색 기능을 제작 중입니다.

<br>

<img src="https://github.com/jinseon22/CoffeeView/raw/main/src/main/resources/static/img/readme/review.png">

- 커피 상세 페이지에서 작성된 리뷰와 평점을 볼 수 있습니다.
- 리뷰 작성이 가능하며 좋아요 기능을 제작 중입니다.
- 사용자 정보에 따라 리뷰 수정, 삭제 기능을 위해 Spring Security를 도입 중입니다.
