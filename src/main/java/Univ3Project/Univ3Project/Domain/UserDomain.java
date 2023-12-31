package Univ3Project.Univ3Project.Domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
public class UserDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phoneNumber;
    private String userId;
    private String passwordHash;
    private LocalDate birthday;

    // Standard getters and setters...
}