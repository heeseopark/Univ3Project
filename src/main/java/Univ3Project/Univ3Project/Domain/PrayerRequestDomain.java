package Univ3Project.Univ3Project.Domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class PrayerRequestDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDomain user;

    private LocalDate date;
    private String prayerRequest;
    private String comments;

    // Standard getters and setters...
}

