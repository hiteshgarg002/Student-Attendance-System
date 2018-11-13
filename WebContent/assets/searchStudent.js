$(document).ready(function(){
	$.getJSON('GetAllDepartmentsJSON',{ajax:true},function(data){
		$('#dept').append($('<option>').text('-Department-'));
		$.each(data,function(i,item){
			$('#dept').append($('<option>').text(item.DEPARTMENT_NAME).val(item.DEPARTMENT_ID));		
		});
	});
	
	
	$('#btn').click(function(){
		var htm= "<form action = 'MarkAttendance'><table border = 1 >";
		htm+="<tr>";
		htm+="<th>Name</th><th>DOB</th><th>Gender</th><th>Email</th><th>Enrollment Number</th><th>Year Of Admission </th><th></th>";
		htm+="</tr>";
		$.getJSON("SearchStudentJSON",{ajax:true,sem : $('#sem').val(),dept : $('#dept').val()},function(data){
			$.each(data,function(i,item){
				htm+="<input type = hidden name='sem' value = '"+$('#sem').val()+"'  >";
				htm+="<input type = hidden name='dept' value = '"+$('#dept').val()+"'  >";
				htm+="<tr>";
				htm+="<td>"+item.NAME+"</td>";
				htm+="<td>"+item.DOB+"</td>";
				htm+="<td>"+item.GENDER+"</td>";
				htm+="<td>"+item.EMAIL+"</td>";
				htm+="<td>"+item.ENROLLMENTNO+"</td>";
				htm+="<td>"+item.YEAROFADMISSION+"</td>";
				htm+="<td><input type='checkbox' name='eno' value='"+item.ENROLLMENTNO+"'></td>";
				htm+="</tr>";
			});
		htm+="<tr><td><input type='submit'></td></tr>"
	    htm += "</table></form>";
		$('#result').html(htm);
		});
	
	});
});