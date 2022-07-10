package com.example.personajes.personajes.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "peliculaoserie")
@Getter
@Setter


public class PeliculaSerieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;   // URL
    private String titulo;
    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd") // Define como va a llegar el formato, patron.
    private LocalDate fechaCreacion;



    //  Relacion Many to One
    //       - 1 genero puede estar relacionado a muchas peliculas.
    //       - 1 pelicula puede tener 1 solo genero.

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id", insertable = false, updatable = false)
    private GeneroEntity genero;

    @Column(name = "genero_id", nullable = false)
    private Long generoId;



    // Relacion Many to Many
    //       - 1 pelicula puede tener muchos personajes
    //       - 1 personaje puede estar en muchas peliculas


    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE })
    @JoinTable(                                   // Configurar detalles de la relacion
            name = "personaje_pelioserie",                             // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "pelioserie_id"),         // columna1 de la tabla intermedia
            inverseJoinColumns = @JoinColumn(name = "personaje_id"))   // columna2 de la tabla intermedia
    private Set<PersonajeEntity> icons = new HashSet<>();












/*   Boceto de metodo para chequear calificacion ingresada

    public String chequearCalificacion(int calificacion) {
        String mensaje = null;
        if (calificacion < 1 || calificacion > 5) {
            mensaje = "Calificacion debe ser del 1 al 5";
        }
        return mensaje;
    }

*/


}