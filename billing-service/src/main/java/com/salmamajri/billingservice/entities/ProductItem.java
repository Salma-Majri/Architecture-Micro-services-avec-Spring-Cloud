package com.salmamajri.billingservice.entities;

import com.salmamajri.billingservice.model.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductItem {
    @Id @GeneratedValue
    private Long id;
    private long productId;
    private int quantity;
    private double price;
    @ManyToOne
    private Bill bill;
    @Transient
    private Product product;
}