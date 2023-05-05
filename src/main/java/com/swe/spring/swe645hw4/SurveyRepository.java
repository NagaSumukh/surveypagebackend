package com.swe.spring.swe645hw4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
//	List<survey> findAll();
}





