$(document).ready(function(){
	var mainServiceContainerObj = $('.mainServiceContainer');
	var mainServiceSectionObjClone  = $('.mainServiceSection').clone(true);
	var itemSectionObjClone  = $('.itemSection').clone(true);
	var addMoreServiceButton = $('#addMoreService');
	var addMoreItem = $('#addMoreItem');
	var itemsObj = $('.items');
	
	/*addMoreServiceButton.click(function() {
		
	});*/
	
	$('.addMoreService').click(function(){
		addNewService(); //Here Findout the parent and pass to the function
	});
	
	$('.addMoreItem').click(function(){
		var obj = $(this);
		addItemsToService(obj);
	});
	
	/*addMoreItem.click(function(){
		
	});*/
	
	function addItemsToService(obj){
		var itemsObjLast = obj.parent().parent().last();
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
});

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
