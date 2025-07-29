package forum.vet.api.Foro.publicacion;

import jakarta.validation.constraints.NotNull;

import java.util.TimeZone;

public record DatosActualizacionTopico(
        @NotNull Long id,
        String titulo,
        String mensaje,
        String autor
) {

}
