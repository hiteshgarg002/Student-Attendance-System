$(document).ready(function(){
	
	$.getJSON('GetAllBranchJSON',{ajax:true},function(data){
		$('#ubranch').append($('<option>').text('-Branch-'));
		$.each(data,function(i,item){
			$('#ubranch').append($('<option>').text(item.DEPARTMENT_NAME).val(item.DEPARTMENT_ID));		
		});
	});
	
	for(var i=1; i<9; i++) {
		$('#semester').append($('<option>').text(i).val(i));
	}
	
	$('#ubranch').change(function(){
		$.getJSON('GetAllSubjectsJSON',{ajax:true,branchid:$('#ubranch').val()},function(data){
			$('#usubject').empty();
			$('#usubject').append($('<option>').text('-Subject-'));
			$.each(data,function(i,item){
				$('#usubject').append($('<option>').text(item.SUBJECTNAME).val(item.SUBJECTID));
			});
		});
	});
	
});
	




