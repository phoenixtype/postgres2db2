package dev.phoenixtype.postgres2db2.service;

import dev.phoenixtype.postgres2db2.model.StudentRecord;
import dev.phoenixtype.postgres2db2.repository.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentsRepository studentRepository;

    public StudentRecord saveStudent(StudentRecord student) {
        return studentRepository.save(student);
    }

    public void insertStudents(List<StudentRecord> students) {
        studentRepository.saveAll(students);
    }
}
