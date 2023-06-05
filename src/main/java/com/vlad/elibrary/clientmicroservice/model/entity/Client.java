package com.vlad.elibrary.clientmicroservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "clients")
public class Client {

    @Id
    private String uuid;

    @Column(name = "name", length = 60)
    private String name;

    @Column(name = "surname", length = 60)
    private String surname;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @JoinColumn(name = "account_info_id")
    @OneToOne(cascade = CascadeType.REMOVE)
    private AccountInfo accountInfo;

    @JoinColumn(name = "passport_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Passport passport;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
}
