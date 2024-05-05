package com.cydeo.entity;

import com.cydeo.dto.CompanyDto;
import com.cydeo.entity.common.BaseEntity;
import com.cydeo.enums.ProductUnit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product extends BaseEntity {

    private String name;
    private Integer quantityInStock;
    private Integer lowLimitAlert;
    @Enumerated(EnumType.STRING)
    private ProductUnit productUnit;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category")
    private Company category;

}
