package html

import assignment.Department
import assignment.Course
import org.eclipse.emf.ecore.EObject
import assignment.Program
import assignment.Semester
import assignment.Specialisation
import org.eclipse.emf.common.util.EList
import java.util.ArrayList

class HtmlGenerator {
	public ArrayList<String> idList = new ArrayList<String>();
	
	def String generateHtml(Department department) {
		generateHtml(department, new StringBuilder)
	}


	def String generateHtml(Department department, StringBuilder builder) {
		generateHtmlStart("Department", builder)

		for (i : 0 ..< department.programs.size) {
			if (i > 0) builder << "<br/><hr/><br/>"
			generateScript(department.programs.get(i).semseters,builder)
			generatePrograms(department.programs.get(i), builder)
			
			
		}
		
		generateHtmlEnd(builder)
		//generateScript(builder)
		generateStyle(builder)
		builder.toString
	}
	
	
	def static StringBuilder operator_doubleLessThan(StringBuilder stringBuilder, Object o) {
		return stringBuilder.append(o);
	}
	
	def void generateStyle(StringBuilder builder) {
		builder <<
		'''
		<style type="text/css">
		* {
			font-family: arial, sans-serif;
		}
		h1, h2, h3 {
			margin-bottom: 20px;
			margin-left : 20px;
		}
		</style>
		'''
	}
	
	def void generateScript(EList<Semester> semesters ,StringBuilder builder){
		builder <<'''
		<script type="text/javascript">
		
		function checkYears(start, end, selected){
			// parsing all the input to Integers.
			let start_int = parseInt(start)
			let end_int = parseInt(end)
			let selected_int = parseInt(selected)
			console.log("start " , start_int)
			console.log("end ", end_int)
			console.log("start and end stringz", start, end)
			console.log("selected int :  ", selected)
			if(end_int === 0){
				console.log("inside end-int == 0")
				if(selected_int >= start_int) return true;
			}else{
				console.log("endint is not 0")
				if(selected_int >= start_int && selected_int < end_int) return true;
			}
			console.log("returning false! at ",start, end)
			return false;
			
		}
		
		function onClickyear(selected){
			var divs = document.getElementsByClassName("semester");
			// setting all semester to none, so they are removed. 
			for (var i = 0; i < divs.length; i++) {
				divs[i].style.display = 'none';
			}
			«idList».forEach(id => {
				console.log(id.toString())
				
				const start = id.toString().slice(1,5) // here we are fetching the start year. 
				const end = id.toString().slice(5); // here we are fetching the end year
				
				// an example of this is 20202021 where the start year is 2020 and end is 2021
				// OBS! the end year might not exist!
				const is_accepted = checkYears(start, end, selected.value) // checked if the year selected is in this id.
				
				// if the id from the idlist is accepted then we will show this id/semester.
				if(is_accepted) document.getElementById(id.toString()).style.display = 'block';
				
			})
			
			
		}
		
		</script>
		'''
	}
	
	
	
	def void generateHtmlStart(String title, StringBuilder builder){
		builder << 
		'''
		<html>
			<head>
				<title>Department</title>
				<meta http-equiv="content-type" content="text/html; charset="UTF-8"/>
				<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
			</head>
			<body>
			<div class="container">
		'''
	}
	
	
	def void generateHtmlEnd(StringBuilder builder){
		builder << '''
			</div>
			</body>
			<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
					<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
					<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
			</html>
		'''
	}

	

	
	def dispatch void generatePrograms(Program program, StringBuilder builder){
		
		builder << '''
		<h1 id=2020></h1>
		<div class="row" style="text-align:center;">
		<h1>«program.name»</h1>
		<h1> «program.code»</h1>
		</div>
		'''
		if(program.semseters.size > 0)generateStudyplanYear(program, builder)
		
		for(o : 0 ..< program.semseters.size){
			if(program.semseters.get(o).specialisation===null){
				generateSemester(program.semseters.get(o),builder)
			}
		}
		if(program.specialisation!==null){
		builder << "<br/><hr/><br/>"

		//	generateSpecialisationTypes(program, builder)
			
			}
		for(i : 0 ..< program.specialisation.size){
			if(program.specialisation.get(i).endyear===0){
				generateSpecialisation(program.specialisation.get(i),builder)	
			}
		}
	}
	
	
	
	def dispatch void generateSpecialisation(Specialisation specialisation, StringBuilder builder){
		builder << '''
		<h2>«specialisation.name»</h2>
		'''
		for(i : 0 ..< specialisation.semester.size){
		generateSemesterS(specialisation.semester.get(i), builder)	
		}
		
	}
	
	def void generateTableStart(StringBuilder builder, String... headers) {
		builder <<
		'''
		<table class="table table-striped table-responsive mb-8 mt-0">
			<thead>
				<tr>
		'''
		headers.forEach[builder << '''<th>«it»</th>''']
		builder <<
		'''
				</tr>
			</thead>
			<tbody>
		'''
	}
	
	def void generateSpecialisationTypes(Program program,StringBuilder builder){
		builder << '''<select id="specialisation" name="specialisations" '''
		for(i : 0 ..< program.specialisation.size){
			if(program.specialisation.get(i).endyear==0){
				builder << '''
				<option value="«program.specialisation.get(i).name»">«program.specialisation.get(i).name»</option>
				'''	
			}
			
		}
		builder <<'''</select>'''
	}
	
	
	def void generateStudyplanYear(Program program,StringBuilder builder){
		builder <<'''
		<div class="row">
		<h4 style="padding-right:20px;">Kull  </h4>
		
		<div>
		<select class="custom-select float-right" id="yearSelection"" onchange="onClickyear(this)">'''
		//<option>1</option>
		var start = 2020
		var end = 2020
		for(i : 0 ..< program.semseters.size){	
			if(program.semseters.get(i).specialisation===null)	{
				if(program.semseters.get(i).startyear<start){
					start = program.semseters.get(i).startyear
				}			
			}
					
		}
		for(o : 0 ..< end-start+1){
				builder <<'''
					<option value="«start+o»">«start+o» </option>
					'''		
		}
		builder << '''
		</select>
		</div>
		</div>
		'''
	}
	
	def boolean checkSemesterYear(Semester s1, int year){
		if(s1.startyear < year && s1.endyear>=year){
			return true
		}
		return false
	}
	
	
	
	
	
	def dispatch void generateSemester(Semester semester, StringBuilder builder){
		idList.add(Integer.toString(semester.semesternr).concat(Integer.toString(semester.startyear).concat(Integer.toString(semester.endyear))))
		builder <<'''
		<div id="«semester.semesternr»«semester.startyear»«semester.endyear»" class="semester">
		
		'''
		
		if(semester.semesternr % 2 == 0){
			builder << '''
			<div class="row">
			<h5 style="color:gray;padding-right:20px;">Vår </h5>
			'''
		}else{
			builder << '''
			<div class="row">
			<h5 style="color:gray;padding-right:20px;">Høst </h5>
			'''
		}
		builder <<'''
		<h5> Obligatoriske og valgbare emner - «semester.semesternr». semester</h5>
		</div>
		'''
		
		generateTableStart(builder, "Code","Navn","Credits", "Studielevel", "Status")

		if(semester.mandatoryCourse.size>0){
			semester.mandatoryCourse.forEach[generateCourse(it, "mandatory course",builder)]
		}
		if(semester.selectableCourse.size>0){
			semester.selectableCourse.forEach[generateCourse(it, "selectable course",builder)]
		}
		builder <<'''
		</tbody>
		</table>
		</div>
		'''
		
		
	}
	
	def dispatch void generateSemesterS(Semester semester, StringBuilder builder){
		
		builder <<'''
		<div>
		
		'''
		
		if(semester.semesternr % 2 == 0){
			builder << '''
			<div class="row">
			<h5 style="color:gray;padding-right:20px;">Vår </h5>
			'''
		}else{
			builder << '''
			<div class="row">
			<h5 style="color:gray;padding-right:20px;">Høst </h5>
			'''
		}
		builder <<'''
		<h5> Obligatoriske og valgbare emner - «semester.semesternr». semester</h5>
		</div>
		'''
		
		generateTableStart(builder, "Code","Navn","Credits", "Studielevel", "Status")

		if(semester.mandatoryCourse.size>0){
			semester.mandatoryCourse.forEach[generateCourse(it, "mandatory course",builder)]
		}
		if(semester.selectableCourse.size>0){
			semester.selectableCourse.forEach[generateCourse(it, "selectable course",builder)]
		}
		builder <<'''
		</tbody>
		</table>
		</div>
		'''
		
		
	}
	
	def dispatch void generateCourse(Course course,String type, StringBuilder builder){
		
		builder << '''
		<tr>
		<td style="color:blue;">«course.code»</td>
		<td>«course.name»</td>
		<td>«course.credits»</td>
		<td>«course.studylevel»</td>
		<td>«type»</td>
		</tr>
		'''
		
	}
	
	
}