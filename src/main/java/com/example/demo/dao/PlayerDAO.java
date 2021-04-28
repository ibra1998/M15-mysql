package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Player;

public interface PlayerDAO extends JpaRepository<Player,Long> {

}
