var mainServiceContainerObj = $('.mainServiceContainer');
var mainServiceSectionObjClone  = $('.mainServiceSection').clone(true);
var itemSectionObjClone  = $('.itemSection').clone(true);
var addMoreServiceButton = $('#addMoreService');
var addMoreItem = $('#addMoreItem');
var itemsObj = $('.items');
var customerid = $('#customerid').val();
var addressid = $('#addressid').val();
var servicesJsonArray = "";
$(document).ready(function(){
	$('.addMoreService').click(function(){
		addNewService();
	});
	
	$('.addMoreItem').click(function(){
		var obj = $(this);
		addItemsToService(obj);
	});
	
	$('.removeItem').click(function(){
		var obj = $(this);
		removeItemsFromService(obj);
	});
	
	$('.submit').click(function(){
		createJsonArray();
	});
	
	$('.confirm').click(function() {
		servicesJsonArray = createJsonArray();
		$.ajax({
			url: "BookService",
			type: "POST",  
		    dataType: "json",
		    data: {
		    	"customerid":customerid,
				"addressid": addressid,
				"services":servicesJsonArray
		    },
			success: function(jsondata){
				console.log(jsondata);
			}
	   });
	});
	//createJsonArray();
});

function addItemsToService(obj){
	var itemsObjLast = obj.parent().parent().last();
	var newitemsObj = itemsObjLast.clone(true).find('div#itemSectionDiv').val("").remove();
	newitemsObj.find('input').val('');
	newitemsObj.append('<div class="col-md-4"><a class="btn btn-danger removeItem" onclick="removeItemsFromService($(this));"><i class="icon-remove"></i></a></div>');
	newitemsObj.insertAfter(itemsObjLast);
}

function addNewService(){
	var mainServiceContainerObjLast = mainServiceContainerObj.last();
	var newServiceContainerObj = mainServiceContainerObjLast.clone(true);
	newServiceContainerObj.insertAfter(mainServiceContainerObjLast);
}

function removeItemsFromService(obj){
	obj.parent().parent().remove();
}

function createJsonArray(){
	var jsonArray = "[";
	var containerArr = $(".mainServiceContainer");
	for(i=0; i<containerArr.length; i++){
		var tempDiv = containerArr[i];
		//var childrenDiv = tempDiv.children[0];
		var childrenItemsItemSectionArray =  $('> div.mainServiceSection > div.items > div.itemSection', tempDiv);
		
		var tempObject = new Object();
		
		tempObject.serviceType  	= tempDiv.querySelector(".serviceTypeSelect").value;
		tempObject.values = [];
		for (var j = 0; j < childrenItemsItemSectionArray.length; j++) {
			value = {};
			var childrenItemsItemSectionArrayObj = childrenItemsItemSectionArray[j]
			value["itemname"] = childrenItemsItemSectionArrayObj.querySelector(".itemNameValue").value;
			value["quantity"] = childrenItemsItemSectionArrayObj.querySelector(".quantityValue").value;
			tempObject.values.push(value);
		}
		
		var childrenItemsImainServiceSectionArr =  $('> div.mainServiceSection > div.itemSection', tempDiv);
		for (var k = 0; k < childrenItemsImainServiceSectionArr.length; k++) {
			var array_element_obj = childrenItemsImainServiceSectionArr[k];
			newValue = {};
			newValue["itemname"] = array_element_obj.querySelector(".itemNameValue").value;
			newValue["quantity"] = array_element_obj.querySelector(".quantityValue").value;
			tempObject.values.push(newValue);
		}
		
		//tempObject.values = [tempDiv.querySelector(".itemNameValue").value, tempDiv.querySelector(".quantityValue").value];
		var jsonString = JSON.stringify(tempObject);
		jsonArray += jsonString;
		if(i!=containerArr.length-1)
			jsonArray += ", ";
	}
	jsonArray += "]";
	servicesJsonArray = jsonArray;
	console.log(servicesJsonArray);
	return servicesJsonArray;
	
}

/*function createJSON() {
    jsonObj = [];
    //$("input[class=mainServiceContainer]").each(function() {
    //$(".mainServiceContainer :input").each(function() {
    $(".mainServiceContainer").each(function() {
    	item = {}
        item [email];
    	if($(this).is("select")){
    		var email = $(this).val();
    		item [email];
    	}
        var id = $(this).attr("class");
        var email = $(this).val();

        
        //item ["email"] = [{"abcd":"hasjd"}, {"Hemndra":"Bapi"}];
        

        jsonObj.push(item);
    });

    console.log(JSON.stringify(jsonObj));
}*/