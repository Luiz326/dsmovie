package com.luiz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
