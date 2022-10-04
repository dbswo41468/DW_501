// bingo.js

var bingo = new Array();

// bingo의 개수가 25개될 때 까지 반복(중복제거)
while(bingo.length!=25){
    let num = Math.floor(Math.random()*100)+1;
    if( bingo.indexOf(num) == -1){ // -1 이 아니라면 배열에 있는 값이다
        bingo.push(num);
    } 
}


window.onload = function(){ // 시작
    var td = document.querySelectorAll('.box');

    for (var i = 0; i < td.length; i++){
        td[i].innerHTML = bingo[i];
        td[i].addEventListener('click',function(){
            this.style.background = "green";
            check(this.innerHTML);
        });
    }
    
}; // 끝

function check(n){
    // 체크 한 숫자를 빙고배열에서 제외시키기
    for(let i in bingo){
        if(bingo[i] == n){ //선택한 숫자를 배열에서 찾기
            bingo[i] = 0; // 그 공간에 0 넣기
                        // 줄에 0이 몇개냐
            break;
        }
    }

    // 5줄 빙고 확인

    var wd = 0, hg = 0, cr1 = 0, cr2 = 0, end = 0;

    // 가로 세로
    for ( var i=0; i<5; i++){ // 줄
        for(var k = 0; k < 5; k++){ // 칸
            if(bingo [i*5+k] == 0 ) wd++; // 가로, 줄에 0이 몇개냐
            if(bingo [k*5+i] == 0) hg++; // 세로
        }
        if(bingo[i*6] == 0) cr1++; // 대각선 1
        if(bingo[i*4+4] == 0) cr2++ // 대각선 2

        if(wd == 5) end++; // 한줄에 0이 5개라면 1줄 빙고
        if(hg == 5) end++;
        if(cr1 == 5) end++;
        if(cr2 == 5) end++;
        

        wd = 0; // 다시 wd를 0으로 초기화
        hg = 0; 
    }

    if( end == 5 ) alert("비이이잉고오오")
}