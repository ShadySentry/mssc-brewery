package guru.springframework.msscbrewery.domain;

import lombok.*;

import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private UUID id;
    @NonNull
    @Size(min = 3, max = 100)
    private String name;
}
