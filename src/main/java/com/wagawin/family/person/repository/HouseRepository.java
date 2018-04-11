package com.wagawin.family.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wagawin.family.person.model.House;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

}
