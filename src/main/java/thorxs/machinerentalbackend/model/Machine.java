package thorxs.machinerentalbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Machine {
    @NotNull
    private int id;
    @NotNull
    private int brandId;
    @NotBlank
    private String name;
    @NotNull
    private int machineTypeId;
    @Min(0)
    private double powerOutput;
    @Min(0)
    private double weight;
    @Min(0)
    private int rentalPrice;
    @Min(0)
    private int safetyDeposit;
}
