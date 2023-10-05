package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import application.model.Autor;
import application.model.Genero;





@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;

@ManyToOne
@JoinColumn(name="id_genero")
private Genero genero;

@ManyToOne
@JoinColumn(name="id_autor")
private Autor autor;

public void setAutor( Autor autor) {
    this.autor=autor;
}

public Autor getAutor(){
    return this.autor;
}


public void setGenero (Genero genero){
    this.genero=genero;
}

public void getGenero(){
    return this.genero;
}
 



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; // Correção: atribuir o valor do parâmetro nome ao campo nome
    }
}
