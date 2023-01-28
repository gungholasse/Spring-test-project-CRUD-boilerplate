package com.example.demo.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.*;
import com.example.demo.repository.PriceRepository;

@Service
public class PriceService {

  @Autowired
  private PriceRepository repo;

  public void save(Price price) {
    repo.save(price);
  }

  public Price get(Long id) {
    return repo.findById(id).get();
  }

  public List<Price> listAll() {
    return repo.findAll();
  }

  public int calc(String[] goods) {
    
    return 100;
  }
}
