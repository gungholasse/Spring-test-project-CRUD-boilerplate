package com.example.demo.controller;

import com.example.demo.service.*;
import com.example.demo.entity.*;
import com.example.demo.entity.CheckoutDto.CheckoutDto;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/price")
public class PriceController {

  @Autowired
  private PriceService priceService;

  @PostMapping()
  public void createPrice(@RequestBody Price price) {
    priceService.save(price);
  }

  @PostMapping("/calc")
  public int calc(@RequestBody CheckoutDto request) {
    String[] goods= request.goods.split("(?<=\\G.{1})");

    return priceService.calc(goods);
  }

  @GetMapping("/all")
  public List<Price> list() {
    return priceService.listAll();
  }
}
