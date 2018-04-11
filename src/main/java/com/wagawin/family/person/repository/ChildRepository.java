package com.wagawin.family.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagawin.family.person.model.Child;

public interface ChildRepository extends JpaRepository<Child, Long> {

}
