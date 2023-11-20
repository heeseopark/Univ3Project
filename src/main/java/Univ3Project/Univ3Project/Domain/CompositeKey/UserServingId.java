package Univ3Project.Univ3Project.Domain.CompositeKey;

import Univ3Project.Univ3Project.Domain.ServingDomain;
import Univ3Project.Univ3Project.Domain.UserDomain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserServingId {
    private UserDomain user;
    private ServingDomain serving;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserServingId that = (UserServingId) o;
        return Objects.equals(user, that.user) && Objects.equals(serving, that.serving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, serving);
    }
}
