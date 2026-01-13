package br.com.matheuszilli.resourcebooking.resource;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_resource")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ResourceType type;

    private int capacity;

    private boolean active;

    // Constructos
    public Resource() {
    }

    public Resource(String name, ResourceType type, int capacity, boolean active) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.active = active;
    }
}
