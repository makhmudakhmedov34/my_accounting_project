package com.cydeo.entity;

import com.cydeo.dto.InvoiceDto;
import com.cydeo.dto.ProductDto;
import com.cydeo.entity.common.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "invoice_products")
public class InvoiceProduct extends BaseEntity {

    private Integer quantity;
    private BigDecimal price;
    private Integer tax;
    private BigDecimal total;
    private BigDecimal profitLoss;
    private Integer remainingQuantity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}
