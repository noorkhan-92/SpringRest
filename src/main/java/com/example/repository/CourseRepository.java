package com.example.repository;

import com.example.entities.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 *
 * @author noor
 */
public interface CourseRepository extends Neo4jRepository<Course, Long> {
    
}
