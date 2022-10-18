
function tb(col,row,wd,hg){
    this.col=col;
    this.row=row;
    this.width=wd;
    this.height=hg;
}

var tb_list =new Array();
var bt_cnt = 0;
var bt_check = false;

var arr = new Array();

window.onload = function(){
    var add_bt = document.querySelector("#add");
    add_bt.addEventListener("click", add_button);

    var T_put = document.getElementsByClassName("T_put");
    for(var i in T_put){
        T_put[i].addEventListener("keyup",function(){
            if( !bt_check ){
            alert("새로운 세팅 버튼 추가 요망");
            this.value= '';
            };
        });
    };
};

function add_button(){

    if(bt_check){ // 새 버튼 생성 후 값 등록 안되었으면 새 버튼 생성 금지
        alert("값 먼저 등록 해주세요")
        return;
    }


    var bt = document.createElement("button");
    bt.appendChild(document.createTextNode("세팅"+(++bt_cnt)));
    bt.setAttribute("data-value","0");

    bt.addEventListener("click",function(){
        if( this.dataset.value == 0) // input 값 저장 하기 전
            value_save(this);
        else // input 값 저장 이후
             table_draw(this);
    });
    document.getElementsByClassName("add_wrap")[0].appendChild(bt);
    bt_check = true;
};

function table_draw(obj){
    var draw = document.querySelector("#draw");
    var data = tb_list[parseInt(obj.dataset.value)-1];

    var out = "<table border = 1>";
    for(var i=1; i<=data.col; i++){ // 행
        out += "<tr>"
        for(var k=1; k<= data.row; k++){
            out += "<td width = "+ data.width+" height = "+data.height+"></td>";
        }

        out += "</tr>"
    }

    out += "</table>"

    draw.innerHTML = out;
};

function value_save(obj){
    var input_label=["행","열","너비","높이"]
;    var T_put = document.getElementsByClassName("T_put");
    for( var i in T_put){
        if(T_put[i].value == ''){
            alert(input_label[i] + " 을 입력하세요")
            T_put[i].focus();
            return;
        };
    };

    var temp = new tb(T_put[0].value, T_put[1].value, T_put[2].value, T_put[3].value);
    tb_list.push(temp);

    obj.dataset.value = bt_cnt;

    bt_check=false;
    for(var i = 0 ; i < T_put.length; i++){
        T_put[i].value='';
    };
};































