package com.example.backendproductos.service;
import com.example.backendproductos.repository.ProductoRepository;
import com.example.backendproductos.model.Producto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements CommandLineRunner {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    public Optional<Producto> getProductoById(Long id) {
        return productoRepository.findById(id);
    }

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void run(String... args) {
        if (productoRepository.count() == 0) {
            productoRepository.saveAll(List.of(
                    new Producto(null, "Laptop HP", 2500000, 15),
                    new Producto(null, "Mouse Logitech", 120000, 30),
                    new Producto(null, "Teclado Redragon", 180000, 20),
                    new Producto(null, "Monitor Samsung 24\"", 750000, 10),
                    new Producto(null, "Disco SSD 1TB", 420000, 25),
                    new Producto(null, "Memoria RAM 16GB", 300000, 18),
                    new Producto(null, "Audífonos Sony", 150000, 40),
                    new Producto(null, "Silla Gamer Cougar", 890000, 5),
                    new Producto(null, "Cámara Logitech C920", 350000, 12),
                    new Producto(null, "Router TP-Link", 210000, 22)
            ));
            System.out.println("✅ Productos iniciales insertados correctamente.");
        } else {
            System.out.println("ℹ️ La base de datos ya contiene productos, no se insertaron nuevos.");
        }
    }
}
