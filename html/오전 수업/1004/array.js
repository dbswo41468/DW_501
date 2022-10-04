// array.js

// window.onload : html 문서의 모든 내용이 표시된 이후에 동작
// window객체 : 브라우저를 실행시키기 위한 프로그램 틀
// window에만 onload 있는거아님, 모든 객체(html태그 포함)에 존재
// load -> 불러오기 즉 onload는 불러오는 작업이 끝났을 때 동작

var item_list = ["핸드폰 거치대","급속 충전기","C타입 케이블","강화 유리",
                 "스마트폰 링","스마트폰 커버"];

window.onload = function (){ // 시작
    var li = document.getElementsByClassName("item"); // getElements 로 가져오는것은 배열로 가져온다
    // var li = document.querySelectorAll(".item"); // querySelectorAll 로 가져올 때는 class이름 앞에 . 포함, 배열로 가져온다

    // for ( var i=0; i<li.length; i++)
    for(var i in li) { // for( in) : 배열 구조에서 사용
        li[i].innerHTML = item_list[i];
    }
}; // 끝


var item = new Array();
function enroll(){
    var name = document.getElementById("item_name");
    // var name = document.querySelector("#item_name");

    var prop = name.value;
    item.push(prop);


    var price = document.querySelector("#item_price");
    

    var ul = document.querySelector("#item_list");

    var li = document.createElement("li"); // li 태그 생성, createElement 함수 작성 후 만들고자 하는 태그 이름 쓰기
        
        li.innerHTML = item[item.length - 1]; // li 태그 안에 제품명 생성 
        // li.innerHTML = item[item.length - 1] + "price.value+"원;

        var b = document.createElement("b");
        
        b.innerHTML = price.value + "원";

        li.appendChild(b);

        var bt = document.createElement("button");

        bt.setAttribute("class", "del_bt");

        bt.setAttribute("onclick", "del(this)");

        bt.innerHTML = "삭제";
        li.appendChild(bt);

        ul.appendChild(li); // ul 태그 자식으로 li추가
        
    }

    function del(obj){
        var parent_li = obj.parentNode;
        var parent_ul = parent_li.parentNode;
        parent_ul.removeChild(parent_li);
    }
    
    /*
        실습.
        제품 등록 하면서 제품 가격과 함게 등록 할 수 있게 만들기
        제품 가격 입력하는 input 만들어서 등록
        예시) 거치대 3000월 삭제

    */

        // 따라 만들기
    // var dieso = new Array();
    
    // function moll(){
    //     var input_box = document.getElementById("input_box");
    //     var val = input_box.value;
    //     dieso.push(val);

    //     var ull = document.querySelector("#product_list");
    //         var lii = document.createElement("li");

    //         li.innerHTML = dieso[dieso.length - 1];
    //         var but = document.createElement("button");
    //         but.setAttribute("class", "but_er");
    //         but.setAttribute("onclick", "eraser(this)");
    //         but.innerHTML = "지우기";
    //         lii.appendChild(but);
    //         ull.appendChild(lii);

    // }

    // function eraser(ect){
    //     var par_li = ect.parentNode;
    //     var par_ul = par_li.parentNode;
    //     par_ul.removeChild(par_li);
    // }



    /*
        document.createElement : 새 태그 생성
        예시) document.createElement("div"); div 생성

        appendChild : 자식 태그로 추가
        예시) p = docyment.createElement("p");
        body.appendChild(p); : body에 p 태그 추가

        setAttribute : 태그에 새속성 추가
        예시) p.setAtteribute("id", "ppp"); 해당 태그에 id="ppp" 삽입

        removeChild : 자식 태그 삭제
        예시) body.removeChild(p); : body 태그에서 해당 태그 삭제

    */

    // 새 태그(엘리먼트,요소,객체)를 생성 하는 방법 : createElement() 함수

    // 태그(엘리먼트) 내부에 새로운 내용으로 삽입하는 방법 : innerHTEML 속성
    // 태그(엘리먼트) 내부에 새로운 내용을 추가 삽입 하는 방법 : appendChild 함수, appendChild 사용하려면 노드가 필요하다
    // 태그(엘리먼트) 내부에 텍스트 형식으로 삽입하는 방법 : appendChild(textnode)
