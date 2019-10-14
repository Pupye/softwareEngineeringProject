package com.Almus.Dao;

import com.Almus.Entity.Student;
import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Sain", "CS"));
                put(2, new Student(2, "Saddam", "Finance"));
                put(3, new Student(3, "Mansur", "Psychology"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void deleteStudentById(int id) {
        this.students.remove(id);
    }

    public void updateStudent(Student student){
        Student student1 = students.get(student.getId());
        student1.setCourse(student.getCourse());
        student1.setName(student.getName());
        students.put(student.getId(), student);
    }

    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }
}
