/* html 작업
1. input 1개 생성 (생년월일 입력 : 1999.01.02)
    너비 200, 높이 35, 폰트 17

2. 버튼 1개 생성
    입력, 너비 100, 높이 37, 폰트 15

3. div #birthday 생성

4. div #birthday 하위 태그로 ul태그 생성

5. ul 태그 하위로 li 태그 3개
    (각각 li에 태어난 년도, 태어난 월, 나이)


자바 스크립트 작업
1. 버튼 이벤트 생성, 함수 input
2. input 함수에서 value값 가져오고 출력
3. getYear 함수 ( 태어난 년도 구하기)
4. getMonth 함수 ( 태어난 월 구하기)
5. getAge 함수 ( 나이 구하기)
*/

window.onload = function(){ // bt에 이벤트 추가 클릭 했을 때 input 함수가 실행된다
    var bt = document.getElementById("bt");
    bt.addEventListener("click",input);
};

function input(){
    var val = document.getElementById("ip").value; // input 값 가져오기

    var ye = document.getElementById("ye"); // 출력될 li 가져오기
    var mon = document.getElementById("mon");
    var age = document.getElementById("age");
    // class 로 가져 올 경우 배열을 지정 해줘야한다
    // ex) var info = document.getElementsByClassName("info");
    // info[0].innerHTML = val;
    // info[1].innerHTML = val;
    // info[2].innerHTML = val;
    
    ye.innerHTML=getYear(val);  // 각각 함수에 값 넣어주기
    mon.innerHTML=getMonth(val);
    age.innerHTML=getAge(val);
}

function getYear(val){
    var year = val.split(".")[0]; // 스플릿은 자동으로 배열로 담긴다

   return "년도 :" + year;
   
   // retur : 자신이 사용된 위치로 돌아간다

}

function getMonth(val){
    var month = val.split(".")[1]; // 스플릿은 자동으로 배열로 담긴다
    return "월 : " + month;
}

function getAge(val){
    var age = val.split(".")[0]; // 스플릿은 자동으로 배열로 담긴다
    return "나이 : " + (2022-(parseInt(age))+1);
}

