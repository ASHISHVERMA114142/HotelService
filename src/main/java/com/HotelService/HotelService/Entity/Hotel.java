package com.HotelService.HotelService.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Columns;

@Entity
@Table(name="hotel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    @Column(name="hotelId")
    private  String id ;
    @Column(name="name")
    private  String name;
    @Column(name="location")
    private  String location;
    @Column(name="about")
    private  String about;

}
