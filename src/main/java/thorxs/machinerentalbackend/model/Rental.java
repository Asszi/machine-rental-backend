package thorxs.machinerentalbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rental {
    @NotNull
    private int id;
    @NotNull
    private Company company;
    @NotNull
    private Machine machine;
    @NotNull
    private LocalDateTime rentalStart;
    private LocalDateTime rentalEnd;
}
