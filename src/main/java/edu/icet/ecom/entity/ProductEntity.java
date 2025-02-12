package edu.icet.ecom.entity;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String vendor;
    private Double price;
}
