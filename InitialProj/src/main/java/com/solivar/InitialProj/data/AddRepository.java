package com.solivar.InitialProj.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

@Repository
public interface AddRepository extends JpaRepository<AddEntity, Long> {

}
