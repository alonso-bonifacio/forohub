package org.alura.forohub.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.alura.forohub.domain.topico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topicos")
@SecurityRequirement(name = "bearer-key")
public class TopicoController {
    @Autowired
    private TopicoRepository repository;

    @PostMapping
    @Transactional
    public void registrar(@RequestBody @Valid DatosRegistroTopico datos) {
        repository.save(new Topico(datos));
    }

    @GetMapping
    public Page<DatosListadoTopico> listar(@PageableDefault(sort = {"titulo"}) Pageable paginacion) {
        return repository.findAllByStatusTrue(paginacion).map(DatosListadoTopico::new);
    }

    @PutMapping
    @Transactional
    public void actualizar(@RequestBody @Valid DatosActualizarTopico datos) {
        var paciente = repository.getReferenceById(datos.idTopico());
        paciente.actualizarInformaciones(datos);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminar(@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        paciente.eliminar();
    }
}
