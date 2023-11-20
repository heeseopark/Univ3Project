package Univ3Project.Univ3Project.Domain;

import Univ3Project.Univ3Project.Domain.CompositeKey.UserServingId;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@IdClass(UserServingId.class)
@NoArgsConstructor
public class UserServingDomain{
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDomain user;

    @Id
    @ManyToOne
    @JoinColumn(name = "serving_id")
    private ServingDomain serving;

    private LocalDate startDate;
    private LocalDate endDate;

    // Standard getters and setters...
}

