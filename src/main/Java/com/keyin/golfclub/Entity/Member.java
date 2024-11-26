package src.main.Java.Com.keyin.golfclub.Entity;

import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private LocalDate startDateOfMembership;
    private Integer durationOfMembership;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getStartDateOfMembership() {
        return startDateOfMembership;
    }

    public void setStartDateOfMembership(LocalDate startDateOfMembership) {
        this.startDateOfMembership = startDateOfMembership;
    }

    public Integer getDurationOfMembership() {
        return durationOfMembership;
    }

    public void setDurationOfMembership(Integer durationOfMembership) {
        this.durationOfMembership = durationOfMembership;
    }
}

