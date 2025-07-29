package forum.vet.api.Foro.publicacion;


import java.util.TimeZone;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        String mensaje,
        String autor
) {
    public DatosDetalleTopico(Topico topico){
        this (topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getAutor());
    }
}
