package com.cydeo.dto;

import com.cydeo.enums.InvoiceStatus;
import com.cydeo.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InvoiceDto {

    private Long id;
    private String invoiceNo;
    private InvoiceStatus invoiceStatus;
    private InvoiceType invoiceType;
    private LocalDate date;
    private CompanyDto company;
    private ClientVendorDto clientVendor;
    private BigDecimal price;
    private BigDecimal tax;
    private BigDecimal total;

}
