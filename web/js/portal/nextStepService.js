var mainServiceContainerObj = $('.mainServiceContainer');
var mainServiceSectionObjClone  = $('.mainServiceSection').clone(true);
var itemSectionObjClone  = $('.itemSection').clone(true);
var addMoreServiceButton = $('#addMoreService');
var addMoreItem = $('#addMoreItem');
var itemsObj = $('.items');
var customerid = $('#customerid').val();
var addressid = $('#addressid').val();
var servicesJsonArray = "";
var divCount=0;

var newItemRow = '<div class="form-group itemSection" id="itemSectionDiv">'+
'<div class="col-md-4">'+
'<div class="row">'+
	'<div class="col-sm-6">'+
		'<label for="name"> Item Name<span class="color-red">*</span></label>'+
	'</div>'+
	'<div class="col-sm-6">'+
		'<input type="text" class="form-control itemNameValue" value="">'+
	'</div>'+
'</div>'+
'</div>'+
'<div class="col-md-4">'+
'<div class="row">'+
	'<div class="col-sm-6">'+
		'<label for="name"> Quantity <span class="color-red">*</span></label>'+
	'</div>'+
	'<div class="col-sm-6">'+
		'<input type="text" class="form-control quantityValue" value="">'+
	'</div>'+
'</div>'+
'</div>'+
'</div>'+
'<div class="col-md-4 btnHolderDiv"><a class="btn btn-danger removeItem" onclick="removeItemsFromService($(this));"><i class="icon-remove"></i></a></div>';


var newServiceRow = ''+
'<div class="row service-type-area mainServiceSection" style="border-bottom: 1px dotted #09F;">'+
'<div class="col-md-2">'+
	'<label for="name"> Service Type<span class="color-red">*</span></label>'+
'</div>'+
'<div class="row form-group">'+
	'<div class="col-md-4">'+
		'<select class="form-control serviceTypeSelect">'+
			'<option value="1">Service Type1</option>'+
			'<option value="2">Service Type2</option>'+
			'<option value="3">Service Type3</option>'+
		'</select>'+
	'</div>'+
'</div>'+
'<div class="items">'+
	'<div class="form-group itemSection" id="itemSectionDiv">'+
		'<div class="col-md-4">'+
			'<div class="row">'+
				'<div class="col-sm-6">'+
					'<label for="name"> Item Name<span class="color-red">*</span></label>'+
				'</div>'+
				'<div class="col-sm-6">'+
					'<input type="text" class="form-control itemNameValue" value="">'+
				'</div>'+
			'</div>'+
		'</div>'+
		'<div class="col-md-4">'+
			'<div class="row">'+
				'<div class="col-sm-6">'+
					'<label for="name"> Quantity <span class="color-red">*</span></label>'+
				'</div>'+
				'<div class="col-sm-6">'+
					'<input type="text" class="form-control quantityValue" value="">'+
				'</div>'+
			'</div>'+
		'</div>'+
	'</div>'+
	'<div class="col-md-4" id="addMoreItemDiv">'+
		'<a id="addMoreItem" class="btn btn-primary addMoreItem"> <i class="icon-plus"></i>Click here to Add more item'+
'</a>'
	'</div>'+
'</div>'+
'</div>';
	
	
	
	
	
	
	
	
	
	
	
	
	
	
$(document).ready(function(){
	$('.addMoreService').click(function(){
		addNewService();
	});
	$('.mainServiceContainerDummy').hide();
	$('.addMoreItem').click(function(){
		var obj = $(this);
		addItemsToService(obj);
	});
	
	$('.removeItem').click(function(e){
		var obj = $(this);
		removeItemsFromService(obj);
		//e.preventDefault();
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
});

function addItemsToService(obj){
	var itemsObjLast = obj.parent().parent().last();
	/*var newitemsObj = itemsObjLast.clone(true).find('div#itemSectionDiv').val("").remove();
	newitemsObj.find('input').val('');
	newitemsObj.append('<div class="col-md-4"><a class="btn btn-danger removeItem" onclick="removeItemsFromService($(this));"><i class="icon-remove"></i></a></div>');*/
	
	//newitemsObj.insertAfter(itemsObjLast);
	itemsObjLast.append(newItemRow);
	
}

function addNewService(){
	var mainServiceContainerObjLast = mainServiceContainerObj.last();
	var newServiceContainerObj = mainServiceContainerObjLast.clone(true);//.find('> div.mainServiceSection > div.items > div.itemSection').first();
	newServiceContainerObj.find('input').val('');
	newServiceContainerObj.insertAfter(mainServiceContainerObjLast);
	//mainServiceContainerObjLast.append(newServiceContainerObj);
}

function removeItemsFromService(obj){
	/*items=obj.parent().parent('.items');
	items.children().last().remove();
	items.children().last().remove();*/
	obj.parent().prev("div.itemSection").remove();
	obj.parent().remove();
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