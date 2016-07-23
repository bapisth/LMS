
	var dataTableObjSample_1 = null;



	function f_buildListTable(){
		
		$('#bookingDetailSample_1').dataTable().fnDestroy();
		dataTableObjSample_1 = $('#bookingDetailSample_1').DataTable( {
	        "stateSave": true,
	        "processing": true,
	        "serverSide": true,
	        //"filter": false,
	        "ajax": {
	        	'type': 'POST',
	            'url': 'adminAjax?cmd=bookingDetailSample_1',
	        },
	        "columns": [
	            { "data": "col1", "defaultContent": "" },
	            { "data": "col2", "defaultContent": "" },
	            { "data": "col3", "defaultContent": "" },
	            { "data": "col4", "defaultContent": "" },
	            { "data": "col5", "defaultContent": "" }
	            
	        ],
	        "order": [[ 0, "desc" ]]
	    } );
		
	}
	
	function grtBookingDetail(bookingid){
		window.location.href = "portalAdmin?cmd=bookingDetailInfo&bookingid="+bookingid;
	}





