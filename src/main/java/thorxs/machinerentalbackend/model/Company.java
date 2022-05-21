package thorxs.machinerentalbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company {
    @NotNull
    private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String representative;
    @NotBlank
    @Length(min = 11, max = 11)
    private String taxId;
    @NotBlank
    private String companyRegistrationNumber;
    @NotBlank
    private String headquartersAddress;
}
