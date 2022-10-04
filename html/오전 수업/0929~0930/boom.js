// boom.js

var board = new Array(400);
board.fill(0); // 배열에 채우기 * fill *

for( i=0; i<200;){ // 폭탄 있다 없다 구하기(중복제거) 1은 폭탄 0 없다
    let pos = Math.floor(Math.random()*400); // 0~400까지의 랜덤 숫자 대입
    if( board[pos] != 1){ // board[pos]의 랜덤 값이 !== 1(1과 같지 않다면)
        board[pos] = 1; // board[pos]에 1을 대입한다
        i++;
    }
}

// 무작위 값이 1이 아니라면 1을 대입하고 200번 반복한다


window.onload = function(){ // 테이블 태그 만드는 for문
    var table = "<table>";
    for( var i = 0; i<20; i++){
        table += "<tr>"; 
        for( var k = 0; k<20; k++){
            table += '<td class="bm" data-idx = ' + ( i * 20 + k ) +'></td>';
            // 밖에 사용하는 따옴표와 같은 따옴표를 써야 조건 사용 가능
            // td에 개별 번호 설정
        }
        table += "</tr>";
    }
    document.getElementById("wrap").innerHTML = table;

    // "<table>" + "<tr>" +  '<td class="bm" data-idx = ' + "</tr>"

    var bm = document.getElementsByClassName("bm");
    // 클래스 이름을 가져오게 되면 배열로 가져오게 된다
    
    //alert(bm.length);
    //bm[0].style.background="red";
    for(var i in bm){ // i 를 bm배열만큼 돌린다
        bm[i].addEventListener('click',function(){ // td를 클릭했을때 이벤트
            // 이벤트에 사용하는 i와 폭탄 구하는 i이와 같이 사용이 안된다
            // 이벤트가 실행했을때는 이미 for문이 끝났다
            let n = this.dataset.idx; // idx의 값을 가지고 오게된다.
            if(board[n] == 1){
                this.style.background =
                'url(../image/ㅍㅌ2.png) no-repeat center center';
                this.style.backgroundSize = 'cover';
                // this.innerHTML="<img src='../image/ㅍㅌ2.png'>";
            }
            else this.style.background="rgb(230,230,230)";
        });
    }
};

