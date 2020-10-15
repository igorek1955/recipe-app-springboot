package guru.springframework.commands;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//question - зачем нужны команды
@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String description;
}
