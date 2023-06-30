package com.pro.csv.Repository;

import com.pro.csv.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByContact1(String contactNumber1);

    Student findByContact2(String contactNumber2);
}
