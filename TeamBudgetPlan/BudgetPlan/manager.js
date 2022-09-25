var pinfo;
function addData(){
    var cnameval=document.getElementById("cname").value
    var pnameval=document.getElementById("pname").value
    var budgetval=document.getElementById("budget").value
    var obj= sessionStorage.getItem("obj")
    let budgetplanner={cname:cnameval,pname:pnameval,budget:budgetval};
    if(obj==null){
        pinfo = new Array();
        pinfo.push(budgetplanner);
        sessionStorage.setItem("obj",JSON.stringify(pinfo));
    }else{
        obj = JSON.parse(obj);
        obj.push(budgetplanner);
        sessionStorage.setItem("obj",JSON.stringify(obj));
    }
    document.getElementById("cname").value=""
    document.getElementById("pname").value=""
    document.getElementById("budget").value=""
    document.getElementById("add").innerHTML="Budget Added"
}
function retrieveData(){
    var obj = sessionStorage.getItem("obj");
    if(obj==null){
        document.getElementById("out").innerHTML="Record not present"
    }else {
        let Data = JSON.parse(obj);
        var table = document.createElement('table');
        var thead=document.createElement('thead');
        table.appendChild(thead)
        var hrow=document.createElement("tr")
        var h1=document.createElement("th")
        h1.innerHTML="Client Name"
        var h2=document.createElement("th")
        h2.innerHTML="Project Name"
        var h3=document.createElement("th")
        h3.innerHTML="Budget"
        hrow.appendChild(h1)
        hrow.appendChild(h2)
        hrow.appendChild(h3)
        thead.appendChild(hrow)
        var tbody = document.createElement('tbody');
        for(let i =0;i<Data.length;i++){
            var row=document.createElement("tr")
            var td1=document.createElement("td")
            td1.innerHTML=Data[i].cname
            var td2=document.createElement("td")
            td2.innerHTML=Data[i].pname
            var td3=document.createElement("td")
            td3.innerHTML=Data[i].budget
            row.appendChild(td1)
            row.appendChild(td2)
            row.appendChild(td3)
            tbody.appendChild(row)
        }
        table.appendChild(tbody)
        document.getElementById("result").appendChild(table)
    }
}