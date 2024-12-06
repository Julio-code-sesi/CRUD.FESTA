package com.teste.festa.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.festa.Model.FestaModel;

@Repository

public interface FestaRepository extends JpaRepository<FestaModel, UUID> {

}
