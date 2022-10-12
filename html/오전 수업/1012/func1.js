//func.js

/*
html 작업

1. input 2개 생성 - 너비 150, 높이 35, 둥근모서리
2. 버튼 1개 생성 -> text입력, 너비 80, 높이 35
    검정 바탕 흰색 글씨, 글씨 크기 15px
3. div 생성 -> id -output, 너비 500, 화면 가운데 표시


자바 스크립트 작업

1. 입력 버튼 클릭시 이벤트 생성 - 함수명input
2. input함수 -> 두 input value값 가져오기
3. list_push 함수 -> 두개 value 값 input 함수로부터
    받아서 배열 list에 저장
4. output_list 함수 -> 배열 list의 값 div #output에 출력
    이름 출력 영역 너비 150, 높이 30
    직업 출력 영역 너비 150, 높이 30

*/

window.onload = function(){ // bt에 이벤트 추가 클릭 했을 때 input 함수가 실행된다
    var bt = document.getElementById("bt");
    bt.addEventListener("click",input);
};

function input(){ // input의 값을 가져오고 list_push에 넣어준다
    var in1 = document.getElementById("input1");
    var in2 = document.getElementById("input2");
    // input 엘리먼트 객체로 가져오기
    if(in1.value == "" || in2.value == ""){
        return;
    }

    list_push(in1.value,in2.value);
    // input value 값 list_push에 넘기기

   
    in1.value = ''; // in1 input 값 초기화
    in2.value = ''; // in2 inpue 값 초기화

    // in1.focus(); // in1 input에 커서 이동
};

// var ps = new Array(); 선생님 방식 1
function list_push(in_1,in_2){
    var ps = new Array();
    ps.push(in_1);
    ps.push(in_2);
    output_list(ps);

    // 선생님 방식2 appendChild 사용하지 않고 만들기
    /*
    var out = "<span>"+in1+"</span><span>"+in2+"</span>";
    list_push.push(out);
    output_list();
    */

    // 배열안에 배열로 넣을 때
    /*
    ps.push( [in1,in2]);
    */

    // 객체로 넣을때?
    /*
    ps.push( { n : in1, j : in2});
    */
};

function output_list(ps){
    var r_out = document.getElementById("output");
    var div1 = document.createElement("div");
    var div2 = document.createElement("div");
    div1.setAttribute('style','width:150px; heigth : 30px');
    div1.appendChild(document.createTextNode("이름 : "+ ps[0]));
    r_out.appendChild(div1);
    // r_out.setAttribute('style','display : flex;' ); 
    div2.setAttribute('style','width:150px; heigth : 30px');
    div2.appendChild(document.createTextNode("직업 : "+ ps[1]));
    r_out.appendChild(div2);

    // 선생님 방식 3
    /*
    var div = document.getElementById("output");
    var out = "";
    for ( var i in list){
        out+=list[i]+<br>; // 줄 띄우기
    }
    div.innerHTML=out;
    */


};














