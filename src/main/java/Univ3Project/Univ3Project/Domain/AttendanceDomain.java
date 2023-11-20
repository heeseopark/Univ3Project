import Univ3Project.Univ3Project.Domain.CompositeKey.AttendanceId;
import Univ3Project.Univ3Project.Domain.UserDomain;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@IdClass(AttendanceId.class)
@NoArgsConstructor
public class AttendanceDomain {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDomain user;

    @Id
    private LocalDate date;

    private int mainService;
    private boolean univ3Service;

    // Standard getters and setters...
}
