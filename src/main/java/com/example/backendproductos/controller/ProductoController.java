package com.example.backendproductos.controller;
import com.example.backendproductos.model.Producto;
import com.example.backendproductos.service.ProductoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*") // 🔹 Permite solicitudes desde cualquier origen (ideal para pruebas)
@RestController
@RequestMapping("/productos") // 🔹 Añadí la barra inicial por buena práctica
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // 🔹 Obtener un producto por ID
    @GetMapping("/{id}")
    public Optional<Producto> getProducto(@PathVariable Long id) {
        return productoService.getProductoById(id);
    }

    // 🔹 Obtener todos los productos
    @GetMapping
    public List<Producto> getAll() {
        return productoService.getAll();
    }
    // 🔹 Guardar un producto
    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }
}
