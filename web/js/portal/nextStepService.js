var mainServiceContainerObj = $('.mainServiceContainer');
var mainServiceSectionObjClone  = $('.mainServiceSection').clone(true);
var itemSectionObjClone  = $('.itemSection').clone(true);
var addMoreServiceButton = $('#addMoreService');
var addMoreItem = $('#addMoreItem');
var itemsObj = $('.items');
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

/**
 * Working Codes:
 * function addItemsToService(){
		var itemsObjLast = itemsObj.last();
		var newitemsObj = itemsObjLast.clone(true).find('div#itemSectionDiv').val("").remove();
		newitemsObj.find('input').val('');
		newitemsObj.append('<div class="col-md-12"></div>');
		newitemsObj.insertAfter(itemsObjLast);
	}
	
	function addNewService(){
		var mainServiceContainerObjLast = mainServiceContainerObj.last();
		var newServiceContainerObj = mainServiceContainerObjLast.clone(true);
		newServiceContainerObj.insertAfter(mainServiceContainerObjLast);
	}
	*/
