
let final_number=0;

function name_checker(text){
    l=['1','2','3','4','5','6','7','8','9','0'];
    parm=true;
    if(text==""){
        return false;
    }
    else{
        for(let i=0;i<text.length;i++){
            if(text[i] in l){
                parm=false;
                break
            }
        }
        
        return parm;
    }
    
}
function validate(email) {
    var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    if (reg.test(email) == false) 
    {
        return false;
    }
    else{
        return true;
    }
}
function numb_check1(value){
    if(value.length<9){
        return false;
    }
    else{
        return true;
    }
}
function year_check1(value){
    if(value.length==4){
        return true;
    }
    else{
        return false;
    }
}
function address_check1(value){
    if(value.length>1){
        return true;
    }
    else{
        return false;
    }
}
function number(area){
    l=['1','2','3','4','5','6','7','8','9','0'];
    parm=true;
    for(let i=0;i<area.length;i++){
        if(!area[i] in l){
            parm=false;
            break
        }
    }
    return parm;
}
function firstname(area){
    let fit_name=document.getElementById(area).value;
    if(name_checker(fit_name)==false){
        document.getElementById(area).style.border="2px solid red";
    }
    else if((fit_name)==""){
        document.getElementById(area).style.border="2px solid white";
    }
    else{
        document.getElementById(area).style.border="2px solid green";
    }
}

function mail_id(area){
    let email=document.getElementById(area).value;
    if(validate(email)==false){
        document.getElementById(area).style.border="2px solid red";
    }
    else{
        document.getElementById(area).style.border="2px solid green";
    }
}

function numberer(area){
    let value=document.getElementById(area).value;
    if(number(value)==false){
        document.getElementById(area).style.border="2px solid red";
    }
    else if((value)==""){
        document.getElementById(area).style.border="2px solid white";
    }
    else{
        document.getElementById(area).style.border="2px solid green";
    }
}
function numbi(area){
    let value=document.getElementById(area).value;
    if((value).length<10){
        document.getElementById(area).style.border="2px solid red";
    }
    else if((value)==""){
        document.getElementById(area).style.border="2px solid white";
    }
    else{
        document.getElementById(area).style.border="2px solid green";
    }
}

function branch(area){
    let value=document.getElementById(area).value;
    if(name_checker(value)==false){
        document.getElementById(area).style.border="2px solid red";
    }
    else if((value)==""){
        document.getElementById(area).style.border="2px solid white";
    }
    else{
        document.getElementById(area).style.border="2px solid green";
    }
}
function year(area){
    let value=document.getElementById(area).value;
    if((value).length>4){
        document.getElementById(area).style.border="2px solid red";
    }
    else if((value)==""){
        document.getElementById(area).style.border="2px solid white";
    }
    else{
        document.getElementById(area).style.border="2px solid green";
    }
}
function address_check(area){
    let value=document.getElementById(area).value;
    if((value).length<1){
        document.getElementById(area).style.border="2px solid red";
    }
    else if((value)==""){
        document.getElementById(area).style.border="2px solid white";
    }
    else{
        document.getElementById(area).style.border="2px solid green";
    }
}

function check_firstname(){
    firstname("firstname");
}
function check_lastname(){
    firstname("lastname");
}
function check_email(){
    mail_id("email");
}
function check_number(){
    numbi("number"); 
}
function branch_check(){
    branch("branch");
}
function year_check(){
    year("year");
}
function address(){
    address_check("address");
}
function returner(area){
    return document.getElementById(area).value;
}

document.querySelector("button").onclick=()=>{
    

    const firstname1=returner("firstname");
    const lastname= returner("lastname");
    const email=returner("email");
    const number= returner("number");
    const branch=returner("branch");
    const year=returner("year");
    const address=returner("address");

    

    if(name_checker(firstname1) && name_checker(lastname) && validate(email) && numb_check1(number) && name_checker(branch) && year_check1(year) && address_check1(address)){
        document.querySelector("button").classList.toggle("dark");
        alert("We got the details!!! Scroll your page down :)");
        document.querySelector(".name-1").innerHTML+= "<br>"+(firstname1+lastname);
        document.querySelector(".email-1").innerHTML+= "<br>"+email;
        document.querySelector(".num-1").innerHTML+= "<br>"+number;
        document.querySelector(".branch-1").innerHTML+= "<br>"+branch;
        document.querySelector(".year-1").innerHTML+= "<br>"+year;
        document.querySelector(".add-1").innerHTML+= "<br>"+address
    }
    else{
        alert("Check all the fields again")
    }
    

}