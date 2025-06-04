package com.tarea.marcos.repository;


import com.tarea.marcos.entity.Parqueo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParqueoRepository extends JpaRepository<Parqueo, Long> {
}