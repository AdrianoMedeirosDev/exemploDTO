package com.senai.prjDto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.prjDto.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
