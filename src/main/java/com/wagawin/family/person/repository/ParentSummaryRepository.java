package com.wagawin.family.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wagawin.family.person.model.ParentSummary;

public interface ParentSummaryRepository extends JpaRepository<ParentSummary, Long> {

    @Query(value = "select distinct p.person_id as amount_of_persons, count(c.child_id) as amount_of_child from person p inner join child c on p.person_id = c.parent_id group by p.person_id", nativeQuery = true)
	List<ParentSummary> getParentSummary();

}
