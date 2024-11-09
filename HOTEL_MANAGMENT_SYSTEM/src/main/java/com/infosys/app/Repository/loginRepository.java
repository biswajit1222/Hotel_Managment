package com.infosys.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.app.entity.Login;
@Repository
public interface loginRepository extends JpaRepository<Login,Long> {
	Login findByUserName(String userName);
}
