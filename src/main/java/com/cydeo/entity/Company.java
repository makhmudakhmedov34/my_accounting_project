package com.cydeo.entity;

import com.cydeo.dto.AddressDto;
import com.cydeo.entity.common.BaseEntity;
import com.cydeo.enums.CompanyStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Where;

import javax.persistence.*;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "companies")
@Where(clause = "is_deleted=false")
public class Company extends BaseEntity {
    private String title;
    private String phone;
    private String website;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Address address;
    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;
}
