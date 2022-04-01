<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> <!-- cdn선언 -->
</head>
<body>
		<%--************************************************************************
		* Ajax의 주요 속성
	 	- url : 데이터를 전송할 URL(필수로 작성!!)
	 	- accept : 파라미터의 타입을 설정(사용자 특화 된 파라미터 타입 설정 가능)
	 	- async : 서버와의 비동기 처리 방식 설정 여부(기본값 true)
	 	- beforeSend : ajax 요청을 하기 전 실행되는 이벤트 callback 함수(데이터 가공 및 header 관련 설정)
	 	- cache : 요청 및 결과값을 scope에서 갖고 있지 않도록 하는 것 (기본값 true)
	 	- complete : 요청 완료 후 실행되는 메소드(성공, 에러 이 후에 무조건 실행)
	 	- contents : JQuery에서 response의 데이터를 파싱하는 방식 정의
	 	- contentType : request의 데이터 인코딩 방식 정의(보내는 측의 데이터 인코딩)
	 	- context : ajax 메소드 내 모든 영역에서 파싱 방식 정의
	 	- crossDomain : 타 도메인 호출 가능 여부 설정(기본값 false)
	 	- data : 요청 parameter 설정
	 	- dataFilter : response를 받았을 때 정상적인 값을 return 할 수 있도록 데이터와 데이터 타입 설정
	 	- dataType : 서버에서 response로 오는 데이터의 데이터 형 설정, 값이 없다면 스마트하게 판단함
	 				 xml - 트리 형태의 데이터 구조
	 				 json - 맵 형식의 데이터 구조(일반적인 데이터 구조)
	 				 script - javascript 및 일반 String 형태 데이터
	 				 html - html 태그 자체를 return 하는 방식
	 				 text - String 데이터
	 	- error : ajax 통신에 실패 했을 때 호출되는 이벤트 핸들러
	 	- global : 기본 이벤트 사용 여부(ajaxStart, ajaxStop)(버퍼링 같이 시작과 끝을 나타낼 때, 선처리 작업)
	 	- method : 서버 요청 방식(GET, POST, PUT)
	 	- password : 서버에 접속 권한(비밀번호)이 필요한 경우
	 	- processData : 서버로 보내는 값에 대한 형태 설정 여부(기본 데이터를 원하는 경우 false설정)
	 	- success : ajax 통신에 성공했을 때 호출될 이벤트 핸들러
	 	- timeout : 서버 요청 시 응답 대기 시간(milisecond)
	 	
	 	[참고] API:http://api.jquery.com/jquery.ajax/
	
	 --******************************************************************************************* --%>
	<h1 align="center">JQuery를 이용한 Ajax테스트</h1>
	<h3>1. 버튼클릭시 get방식으로 서버 데이터 전송 및 응답</h3>
	입력 :
	<input type="text" id="input1">
	<button id="btn1">전송</button>
	응답:
	<input type="text" id="output1" style="width: 300px" readonly>
	<script>
		$(function(){
			$("#btn1").click(function(){
				var input = $("#input1").val();
				
				$.ajax({
					//1. url : 데이터를 전송할 url(필수!!)
					url:"jqTest1.do",
					
					//2. data : 요청시 전달할 파라미터 설정(키 밸류 형식)
					data: { 
						input : input
					},
					
					//3. type : 전송방식(get/post)
					type : "get",
					
					//4. success : Ajax 통신 성공시 처리할 함수를 지정하는 속성. result값을 받아 실행
					success : function(result){
						console.log("Ajax 통신 성공")
						$("#output1").val(result)
					},
					
					//5. error : Ajax 통신 실패시 처리할 함수를 지정하는 속성
					error : function(){
						console.log("Ajax 통신 실패")
					},
					
					//6. complete : 통신 여부와 상관없이 실행
					complete : function(){
						console.log("무조건 호출")
					}
					
				})
			})
		})
		
	</script>
	
	<h3>2. 버튼클릭시 post방식으로 서버 데이터 전송 및 응답</h3>
	입력 :
	<input type="text" id="input2">
	<button id="btn2">전송</button>
	응답:
	<input type="text" id="output2" style="width: 300px" readonly>
	<script>
		$(function(){
			$("#btn2").click(function(){
				var input = $("#input2").val();
				
				$.ajax({
					url: "jqTest2.do",
					
					data : {
						input : input
					},
					
					type: "post",
					
					success : function(result){
						$("#output2").val(result)
					},
					
					error : function(e){
						console.log(e)
					}
				})
			})
		})
		
	</script>
	
	<h3>3. 버튼클릭시 post방식으로 서버에 여러개의  데이터 전송 및 응답</h3>
	이름 :<input type="text" id="input3_1">
	나이 :<input type="text" id="input3_2">
	<button id="btn3">전송</button>
	응답:
	<input type="text" id="output3" style="width: 300px" readonly>
	<script>
	$(function(){
		$("#btn3").click(function(){
			var input3_1 = $("#input3_1").val();
			var input3_2 = $("#input3_2").val();
			
			$.ajax({
				url: "jqTest3.do",
				
				data :{
					name : input3_1,
					age : input3_2
				},
				
				type : "post",
				success : function(result){
					$("#output3").val(result)
				},
				error : function(e){
					$("#output3").val("ajax통신실패")
				}
			})
		})
	})
	</script>
	
	<h3>4. 서버로 기본형 데이터 전송후 , 응답객체를 (object)로받기 </h3>
	회원번호입력 :<input type="text" id="input4">
	<button id="btn4">조회</button>
	<textarea id="textArea4" rows="4" cols="30"></textarea>
	<script>
		$(function(){
			$("#btn4").click(function(){
				
				var input = $("#input4").val();
				$.ajax({
					url : "jqTest4.do",
					
					data : {
						input : input
					},
					type : "get",
					success : function(obj){
						console.log(obj)
						var result = "";
						if(obj != null){
							result = "번호 : " + obj.no + "\n"
									+ "이름 : " + obj.name + "\n"
									+ "나이 : " + obj.age + "\n"
									+ "성별 : " + obj.gender						
						}else{
							result = "사용자 정보가 없습니다."
						}
						
						$("#textArea4").val(result)
					},
					error : function(e){
						$("#textArea4").val("ajax 통신 실패!")
					}
				})	
			})
		})
	</script>
	<h3>5. 서버로 기본형 데이터 전송후 , 응답을 리스트 형태로 받기 </h3>
	<h4>선택한 성별을 가진 모든 회원정보를 가지고 오기</h4>
	성별:
	남<input type="radio" name="chk_gender5" value="남" checked>
	여<input type="radio" name="chk_gender5" value="여">
	<button id="btn5">조회</button>
	<textarea id="textArea5" rows="5" cols="30"></textarea>
	<script type="text/javascript">
		$(function(){
			$("#btn5").click(function(){
				var gen = $('input[name="chk_gender5"]:checked').val(); //체크된 값 가져오기
				
				console.log(gen)
				
				$.ajax({
					url : "jqTest5.do",
					data : {
						gender : gen
					},
					type : "get",
					//dataType : "json", 굳이 안 적어도 됨
					success : function(list){
						console.log(list);
						
						var result = "";
						//$.each(배열명,function(index){});
	 					//배열명[index]  ->  각 요소에 접근
	 					$.each(list, function(i){
	 						result += list[i].no + " / "
	 								+ list[i].name + " / "
	 								+ list[i].age + " / "
	 								+ list[i].gender + " \n"
	 					})	
	 					$("#textArea5").val(result)
					},
					error : function(e){
						$("#textArea5").val("ajax 통신 실패!")
					}
				})
			})
		})	
	</script>
	
	<h3>6.서버로 데이터 전송후 , 응답을 맵(map)형태로 받아서 테이블에 출력하기</h3>
	<h4>조회하고자 하는 회원의 이름 키워드를 입력해서 조회되는 회원들 정보와 전달된 키워드를 받아오기 </h4>
	
	이름<input type="text" id = "input6" width=300>
	<button id = "btn6">검색</button>
	<table id = "memberTable6" border ="1" style="text-align:center">
		<thead>
			<th>번호</th>
			<th>이름</th>
			<th>나이</th>
			<th>성별</th>
		</thead>
		<tbody>
		
		</tbody>
	</table>
	<script>
		$(function(){
			$("#btn6").click(function(){
				var input = $("#input6").val();
				$.ajax({
					url : "jqTest6.do",
					data : {
						keyword : input
					},
					type : "get",
					success : function(map){
						console.log(map)
						console.log(map["jArr"])
						
						//제이쿼리 변수로 선언해서 제이쿼리 함수 사용이 가능
						var $tableBody = $("#memberTable6 tbody") //멤버테이블 안의 tbody에 접근
						$tableBody.html(""); //빈값주기
						$.each(map["jArr"], function(index, value){
							console.log(value)
							
							var $tr = $("<tr>");
							var $noTd = $("<td>").text(value.no); // = <td> value.no </td>
							var $nameTd = $("<td>").text(value.name);
							var $ageTd = $("<td>").text(value.age);
							var $genTd = $("<td>").text(value.gender);
							
							$tr.append($noTd); //tr 태그에 td 내용을 붙이기
							$tr.append($nameTd);
							$tr.append($ageTd);
							$tr.append($genTd);
							
							$tableBody.append($tr); //완성된 tr을 tbody에 넣기
						})
					},
					error : function(){
						console.log("ajax 통신 실패")
					}
				})
			})
		})	
	</script>
	<h3>7.Gson을 이용한 List 반환</h3>
	<button id = "gbtn">list 가져오기</button><br>
	<textarea id ="textarea7" rows="10" cols="30"></textarea>
	<script>
		$(function(){
			$("#gbtn").click(function(){
				$.ajax({
					url: "jqTest7.do",
					type : "get",
					success : function(list){
						console.log(list);
						
						var result = "";
						//$.each(배열명,function(index){});
	 					//배열명[index]  ->  각 요소에 접근
	 					$.each(list, function(i){
	 						result += list[i].no + " / "
	 								+ list[i].name + " / "
	 								+ list[i].age + " / "
	 								+ list[i].gender + " \n"
	 					})	
	 					$("#textarea7").val(result)
					},
					error : function(e){
						$("#textarea7").val("ajax 통신 실패!");
					}
				})
			})
		})
	
	
	
	
	
	
	
	
	
	</script>
</body>
</html>