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

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome;
    }


}