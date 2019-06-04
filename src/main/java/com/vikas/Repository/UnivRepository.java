package com.vikas.Repository;

import com.vikas.Model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnivRepository extends JpaRepository<University, Integer> {

    @Query("select u from University u order by u.Univ_id")
    List<University> showAllUniversities();

    @Query("select u.Univ_id from University u where u.Univ_id =:ID")
    Integer isUniversityThere(@Param("ID") Integer ID);

    @Query("select u.Univ_id from University u where u.Univ_name=:name")
    Integer getUniID(@Param("name") String name);

}
