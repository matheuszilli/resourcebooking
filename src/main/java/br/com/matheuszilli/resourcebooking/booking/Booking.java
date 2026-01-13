package br.com.matheuszilli.resourcebooking.booking;

import br.com.matheuszilli.resourcebooking.resource.Resource;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "tb_booking")
@Getter
@Setter
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "resource_id", nullable = false)
    private Resource resource;

    private String userName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private BookingStatus status;

    private String reason;

    // Constructors
    public Booking() {
    }
    public Booking(Resource resource, String userName, LocalDateTime startTime, LocalDateTime endTime, BookingStatus status, String reason) {
        this.resource = resource;
        this.userName = userName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.reason = reason;
    }

}
