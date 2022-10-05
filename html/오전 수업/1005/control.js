// control.js

// addEventListener 는 태그에 이벤트 설정 하는 함수
// addEventListener("이벤트", 이벤트 발생시 동작 함수)
// function tag_add(){} : 별도 함수를 만드는 방법


window.onload = function (){ // 시작
    var add = document.querySelector("#add");
    add.addEventListener("click",tag_add);
}; // 끝

var add_check = false;

function tag_add(){ // 추가 버튼 시작
    if(add_check){
        return;
    }
    add_check = true;
    var Pdiv = document.querySelector("#score_wrap")
    var div = document.createElement("div");

    var ipt = document.createElement("input");
    ipt.setAttribute("type", "text");
    ipt.setAttribute("id", "name");
    ipt.setAttribute("placeholder", "이름");
        div.appendChild(ipt);
        
        var course = [['국어','kor'],['수학','mat'],['영어','eng']];
        for(let i=0; i<3; i++){
            ipt = document.createElement("input");
            ipt.setAttribute("type", "number");
            ipt.setAttribute("id", course[i][1]);
            ipt.setAttribute('placeholder', course[i][0]);
            div.appendChild(ipt);
        }
        var bt = document.createElement("button");
        bt.addEventListener("click",enroll);
        var text = document.createTextNode("등록");
        bt.appendChild(text);

        div.appendChild(bt);
        // input 태그들을 새div에 담아 넣고 score_wrap에 추가하기

        Pdiv.appendChild(div); // score_wrap div에 추가
} // 끝

function enroll(){ // 등록 버튼 시작
    add_check = false;

    var name = document.querySelector("#name").value;
    var kor = document.querySelector("#kor").value;
    var mat = document.querySelector("#mat").value;
    var eng = document.querySelector("#eng").value;

    var Pdiv = document.querySelector("#score_wrap");

    // score_wrap div에 추가 하는 작업
    var div = document.createElement("div");
    div.setAttribute("class", "score");
    var data = [name, kor, ,mat, eng];
    for( let i in data){
        // input 태그에 입력된 값을 h3 태그에 삽입
        let h = document.createElement("h3");
        let text = document.createTextNode(data[i]);
        h.appendChild(text);
        div.appendChild(h);
    }

    var input =  Pdiv.lastChild;
    Pdiv.removeChild(input); // input 태그 삭제

    Pdiv.appendChild(div); // input 태그 값 div에 삽입

} // 끝





