user();

function user(){ // 유저

    var u = parseInt(prompt("1.가위 2. 바위 3. 보"));
    var c = com();
    result(u,c);
}

function com(){
var c = Math.floor(Math.random()*3)+1;
return c;
}

function result(u,c){
    if(u==c){
        alert("비김");
    }
    else if( (u==1 && c==3) || (u==2&&c==1) || (u==3&&c==2)){
        alert("이김");
    }
    else{
        alert("패배")
    }
}