package gitspringboot.modules.firstModule.firstmodule.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
public class TestStudent {
    String name;
    Integer age;

}
