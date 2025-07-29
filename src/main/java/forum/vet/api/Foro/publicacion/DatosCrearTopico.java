package forum.vet.api.Foro.publicacion;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.TimeZone;

public record DatosCrearTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String autor

) {
}
