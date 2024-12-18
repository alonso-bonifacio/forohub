package org.alura.forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion) {

    public DatosListadoTopico(Topico paciente) {
        this(paciente.getId(), paciente.getTitulo(), paciente.getMensaje(), paciente.getFechaCreacion());
    }
}
