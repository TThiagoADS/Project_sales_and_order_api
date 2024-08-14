package io.github.tthiadoads.domain.repository;

import io.github.tthiadoads.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
