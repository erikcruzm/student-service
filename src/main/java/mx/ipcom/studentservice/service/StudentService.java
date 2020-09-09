package mx.ipcom.studentservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.ipcom.studentservice.model.Student;

@Service
public class StudentService {
	
	List<Student> lista = new ArrayList<Student>();
	
	public Student addSudent(Student newStudent) {
		
		lista.add(new Student(newStudent.getId(), newStudent.getName()));
		
		return lista.get(lista.size() - 1);
	}
	
	public List<Student> getStudents() {
		return lista;
	}

}
