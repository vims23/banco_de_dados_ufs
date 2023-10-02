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
public class rota {


    @Id
    @NotNull
    String id_linha;
    String chassi;
    String periodo;
    
}









