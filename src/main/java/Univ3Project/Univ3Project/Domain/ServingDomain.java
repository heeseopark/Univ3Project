package Univ3Project.Univ3Project.Domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class ServingDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String servingName;

    @ManyToOne
    @JoinColumn(name = "serving_type_id")
    private ServingTypeDomain servingType;

    // Standard getters and setters...
}

