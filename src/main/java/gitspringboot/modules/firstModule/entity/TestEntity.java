package gitspringboot.modules.firstModule.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TestEntity {
    String key;
    String value;

}
