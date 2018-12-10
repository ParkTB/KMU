function checkID(id) {




  if(parseInt(id.charAt(7)) == '1'){
    var aa = "남성";
    var age = 118-id.substr(0,2);
    if (id.substr(2,4) > 0327){
      age = age - 1;
    }
  }
  else if(parseInt(id.charAt(7)) == '3'){
    var aa = "남성";
    var age = 18-id.substr(0,2);
    if (id.substr(2,4) > 0327){
      age = age - 1;
    }

  }
  else if (parseInt(id.charAt(7)) == '2') {
    var aa = "여성";
    var age = 118-id.substr(0,2);
    if (id.substr(2,4) > 0327){
      age = age - 1;
    }
  }
  else if(parseInt(id.charAt(7)) == '4'){
    var aa = "여성";
    var age = 18-id.substr(0,2);
    if (id.substr(2,4) > 0327){
      age = age - 1;
    }

  }
  else{
    alert("Error");
  }
  alert("만 " + age + "세 "+ aa);
}
