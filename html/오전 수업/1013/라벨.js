
function movie(title, dir, year, genre) { // 생성자 함수
    this.movie_title=title;
    this.movie_dir=dir;  
    this.movie_year=year;  
    this.movie_genre=genre;  
}

movie.prototype.out=function(){
    return this.movie_title + " " + this.movie_dir+"    "+
    this.movie_year + " "+ this.movie_genre;
}

var movie_list = new Array(); // movie 객체 저장될 배열

window.onload = function(){ 
    var input = document.getElementsByClassName("movie");
    for(var i in input){
        input[i].addEventListener("focus",function(){// 포커스 주기
            this.classList.add("active"); //add : 
        });
        input[i].addEventListener("blur",function(){// 다른거 눌렀을 때 포커스 풀기
            if(this.value()=""){
                this.classList.remove("active"); //remove : 
            }
            
        });
    }
    
};

function enroll(){
    var val_temp = document.getElementsByClassName("movie");

    var data = new movie(val_temp[0].value,val_temp[1].value,
                        val_temp[2].value,val_temp[3].value,);
    movie_list.push(data);
    print();
}

function print(){

    var li = document.createElement("li");
    li.innerText = movie_list[movie_list.length-1].out();

    document.getElementById("movie_list").append(li);

}


// 객체 : 사물, 사람, 동물등 대표성을 지닌 독립적인 존재

/*
    모든 객체는 자신만의 속성(특성)을 가지며, 자신만의 행동을 갖는다.
    객체 는 자신만의 속성을 가진다 -> 변수
    객체 는 자신만의 행동을 갖는다 -> 함수

    객체 정의 : 추상화 시켜 놓은 것
    추상화의 기본 : 속성과 행동을 나열하고 구성한다
    멤버 변수 : 객체의 속성을 구성
    멤버 함수 : 객체의 송성을 기반으로 행동을 구현해놓은 코드

    객체 생성 : new 연산을 통해서 생성
    생성된 객체는 변수에 저장 하여 사용하는데 이때 변수를 참조변수라고 한다
    참조변수는 ram의 주소를 저장하는 변수이다
   

var obj = new Object();

    도형 객체
    도형.모양 = 사각형
    도형.위치 x축 = 120
    도형.위치 y축 = 50 
    도형.그리기(함수)
    도형.지우기(함수)

    도형.모양 = 삼각형
    도형.위치 x축 = 200
    도형.위치 y축 = 120
    도형.그리기
    도형.지우기

    객체의 멤버로 접근하기 위한 연산자 (.) = access연산자 접근 연산자
    접근연산자는 + , -, ++, &&, || 등 보다 우선 순위가 높음
    도형.위치 x축 +10; 접근 연산자 순위 약 4위
    1순위 () , 2순위 [] , 3순위 ->

    객체 생성 방법
 */
/*
var shape = {
    모양:"사각형",
    x축 : 120,
    y축 : 23,
    draw:function(){
        return " x축 : " + this.x축 + " y축 : " + this.y축+" 위치에 "
        + this.모양 + " 그리기";
    }
}
// 객체 내부에 함수 생성시, 변수(key)의 사용은 this로 접근한다.
// 객체의 값 출력 -> 객체.key

document.write("모양 " + shape.모양);
document.write( shape.draw());
*/
// 객체 생성 방법 1. 객체 리터럴 방식 : 변수처럼 객체를 생성하는 방식



// 학생 객체 생성( 학년, 반, 번호, 이름 )
/*
var name = "윤재영"
var student = {
    학년:1,
    반: 1,
    번호: 11,
    이름: name // 중앙선 표시된것은 권장하지 않는 방식이라는 의미

};

document.write("<br>" + student.이름);
*/
// 객체 생성 방법 2. 생성자 방식 -> new 연산자로 생성하는 방식
// 생성자 방식1) Object객체로 생성
// 생성자 방식2) 함수를 통한 생성

/*
var music =new Object();
music.title = "라이언";
music['가수'] = '여자아이들 ';
music.link = "https://www.youtube.com/watch?v=6oanIo_2Z4Q";

document.write("<a href="+ music.link + ">" +music['title']+
"    "+ music.가수+ "</a>");

function open(link){
    document.
}


var 제목 = '안녕';
var 가수 = '폴킴';
music.title = 제목;
music.가수 = 가수;

document.write(music['title']+"    "+ music.가수);
*/
/*
function movie(제목,감독,년도,장르){
    this.영화제목 = 제목;
    this.감독 = 감독;
    this.개봉년도 = 년도;
    this.장르 = 장르;

    };

movie.prototype,view= function(){
    return this.영화제목 + "    "+ this.감독;
}


var m1 = new movie(' 한산 ',' 김** ', 2022 ,' 시대극 ');

document.write(m1.영화제목);

var m2 = new movie(' 타짜 ',' 최동훈 ', 2007 ,' 범죄 ');

document.write(m2.view());
*/
























