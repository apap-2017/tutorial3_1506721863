package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		int i = 0;
		while(i < studentList.size()) {
			if(studentList.get(i).getNpm().equals(npm)) {
				return studentList.get(i);
			} 
			i++;
		}
		return null;
	}
	
	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}
	
	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}
	
	@Override
	public StudentModel deleteStudent(String npm) {
		int i = 0;
		while(i < studentList.size()) {
			if(studentList.get(i).getNpm().equals(npm)) {
				studentList.remove(i);
			}
			i++;
		}
		return null;
	}
}
