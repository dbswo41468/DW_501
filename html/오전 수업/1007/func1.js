// 진행 순서
// total 함수 실행 -> score_input 함수의 kor,mat,eng 변수값 total에 전달
// -> total함수에서 kor,mat,eng의 합을 tot변수에 저장
// -> tot변수의 값 total함수 실행 위치로 반환(return)
// -> score_input함수에서 total 함수로부터 반환된 값 tot 변수에 저장
// -> score_input함수에서 avg함수 실행
// -> score_input함수의 tot 변수를 avg함수에 전달
// -> avg 함수에서 전달받은 데이터를 tot변수에 저장


// return -> 반관값은 1개만 가능
// 다수의 값을 리턴 시키려면 " 배열 " 사용
function score_input(){
    var kor = 99;
    var mat = 89;
    var eng = 79;
    
    // 총점과 평균 구하기

    total(kor,mat,eng);

    return [kor,mat,eng];
    
}

function total(kor,mat,eng){ // 총점 계산 , score_input의 값이 저장 되어있지만 score_input와 다른 변수다
    var tot = kor,mat,eng ;
    avg(tot);
}

function avg(tot){ // 평균 계산
    var res = tot/3;
    result_pring(res);
}

function result_pring(res){ // 결과 출력
    document.write("평균 : "+res);
}