$(document).ready(function(){
	$.getJSON('GetAllSemestersJSON',{ajax:true},function(data){
		$('#semester').append($('<option>').text('-Semester-'));
		$.each(data,function(i,item){
			$('#semester').append($('<option>').text(item.SEM_NAME).val(item.SEM_NAME));		
		});
	});
	});
	

