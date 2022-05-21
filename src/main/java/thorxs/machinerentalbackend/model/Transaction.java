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
public class Transaction {
    @NotNull
    private int id;
    @NotNull
    private Company company;
    @NotNull
    private int value;
    @NotNull
    private LocalDateTime timestamp;
}
