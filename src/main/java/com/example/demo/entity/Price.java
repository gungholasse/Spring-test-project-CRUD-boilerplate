package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "prices", uniqueConstraints = {@UniqueConstraint(columnNames = "name")})
public class Price {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private int price;

  private int specialNumber;

  private int specialPrice;

  public Price() {
  }

  public Price(String name, int price, int specialNumber, int specialPrice) {
    this.name = name;
    this.price = price;
    this.specialNumber = specialNumber;
    this.specialPrice = specialPrice;
  }

  public Price(Long id, String name, int price, int specialNumber, int specialPrice) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.specialNumber = specialNumber;
    this.specialPrice = specialPrice;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
  return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
 this.price = price;
  }

  public int getSpecialNumber() {
   return specialNumber;
  }

  public void setSpecialNumber(int specialNumber) {
  this.specialNumber = specialNumber;
  }

  public int getSpecialPrice() {
  return specialPrice;
   }

  public void setSpecialPrice(int specialPrice) {
  this.specialPrice = specialPrice;
  }
}
