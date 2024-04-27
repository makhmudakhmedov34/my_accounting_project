package com.cydeo.dto;

import com.cydeo.enums.CompanyStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CompanyDto {
    private Long id;
    private String title;
    private String phone;
    private String website;
    private AddressDto address;
    private CompanyStatus companyStatus;



}
