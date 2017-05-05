function check(){
	var pres = document.getElementsByName("pre");
	var value = null;
	for(var i=0;i<pres.length;i++){
		if(pres[i].checked==true)
			value += pres[i].value + ',';
	}
	alert(value);
	return false;
}