package forum.vet.api.Foro.publicacion;


import java.util.TimeZone;

public record DatosListarTopico(
        Long id,
        String titulo,
        String mensaje,
        String autor
) {
    public DatosListarTopico(Topico topico){
       this(   topico.getId(),
               topico.getTitulo(),
               topico.getMensaje(),
               topico.getAutor());

    }
}
