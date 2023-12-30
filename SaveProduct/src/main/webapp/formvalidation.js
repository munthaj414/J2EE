function validateform()
{
	var proId=document.getElementById("proId").value;
	var proId=document.getElementById("proName").value;
	var proId=document.getElementById("proPrice").value;
	var proId=document.getElementById("proBrand").value;
	var proId=document.getElementById("proMadeIn").value;
	
	if(proId.trim()===""|| proName.trim()===""|| proPrice.trim()===""|| proBrand.trim()===""|| proMdeIn.trim()==="")
	{
		alert("All feilds must be filled out");
		return false;
	}
	 if (parseFloat(proPrice) < 0) { 
        alert("proPrice must be a non-negative value"); 
        return false; 
    } 
    if (proName.length > 50 || proBrand.length > 50) { 
        alert("Product name and proBrand must be less than 50 characters"); 
        return false; 
    } 
    //get the mfg & exp dates 
    var proMfgDate = document.getElementById("proMfgDate").value; 
    var proExpDate = document.getElementById("proExpDate").value;
     
    //convert into date format 
    var manufacturingDateObj = new Date(proMfgDate); 
    var expiryDateObj = new Date(proExpDate); 
    
    //check the validation of dates 
    if (manufacturingDateObj > expiryDateObj) { 
        alert("manufacturing date cannot be greater than expiry date"); 
        return false; 
    } 
    return true; 
}
