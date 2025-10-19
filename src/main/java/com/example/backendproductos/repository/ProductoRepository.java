package com.example.backendproductos.repository;
import com.example.backendproductos.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}