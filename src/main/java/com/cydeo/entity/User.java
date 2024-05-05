package com.cydeo.entity;

import com.cydeo.dto.CompanyDto;
import com.cydeo.dto.RoleDto;
import com.cydeo.entity.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    private String username;
    private String password;
    private String confirmPassword;
    private String firstname;
    private String lastname;
    private String phone;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "role_id")
    private Role role;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "company_id")
    private Company company;
    private boolean isOnlyAdmin;

}
