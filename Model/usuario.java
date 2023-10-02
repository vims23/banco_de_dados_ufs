package com.example.demo.Model;



import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class usuario {

    @Id
    @NotNull
    String id_usuario;
    String nome;
    String sobrenome;
    String email;
    String telefone;
    int idade;





    
}
