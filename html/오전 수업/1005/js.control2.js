window.onload = function (){ // 시작
    document.querySelector("#add").addEventListener("click", function(){
        var city = document.querySelector("#city").value
        var num = document.querySelector("#count").value

        var div = document.createElement('div');

        var h = document.createElement("h3");
        h.appendChild(document.createTextNode(num++));
        div.appendChild(h);
        h = document.createElement("h3");
        h.appendChild(document.createTextNode(city));

        div.appendChild(h);
        h = document.createElement("h3");
        h.appendChild(document.createTextNode(cnt + "명"));
        div.appendChild(h);

        var parent = document.querySelector("#resuls");
        parent.prepend(div);
    }
}; // 끝































































