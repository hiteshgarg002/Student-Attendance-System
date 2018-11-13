$(document).ready(function(){
	$.getJSON('GetAllDepartmentsJSON',{ajax:true},function(data){
		$('#dname').append($('<option>').text('-DEPARTMENT-'));
		$.each(data,function(i,item){
			$('#dname').append($('<option>').text(item.DEPARTMENT_NAME).val(item.DEPARTMENT_NAME));		
		});
	});
});
	

