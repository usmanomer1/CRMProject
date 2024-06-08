package usman.springboot.springdatajpa.crmproject2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import usman.springboot.springdatajpa.crmproject2.model.studentinfo;

public interface ICrmRepo extends JpaRepository<studentinfo, Integer> {

}