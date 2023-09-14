package application.model;

import jakarta.persistence.Entiny;
import jakarta.parsistence.GeneratedValue;
import jakarta.parsistence.GenerationType;
import jakarta.parsistence.Id;
import jakarta.parsistence.Table;

@Entity
@Table(name="generos")
public class Genero {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nome;

    
}