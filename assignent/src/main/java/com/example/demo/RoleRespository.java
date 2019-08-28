package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("roleRepository")
public interface RoleRespository extends JpaRepository<SUPP_REQUESTS, Integer> {

	SUPP_REQUESTS findByRole(String role);
}
