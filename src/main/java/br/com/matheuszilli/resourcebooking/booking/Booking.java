package br.com.matheuszilli.resourcebooking.booking;

import br.com.matheuszilli.resourcebooking.resource.Resource;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_booking")
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

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
