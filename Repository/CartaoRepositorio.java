package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.cartao;


public interface CartaoRepositorio extends JpaRepository<cartao,String> {
    
}



