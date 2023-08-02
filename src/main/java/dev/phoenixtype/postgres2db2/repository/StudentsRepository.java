package dev.phoenixtype.psotgres2db2.repository;


import dev.phoenixtype.psotgres2db2.model.StudentRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<StudentRecord, Integer> {
}
