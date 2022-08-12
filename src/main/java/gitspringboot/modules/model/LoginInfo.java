package gitspringboot.modules.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author qsp
 * @version 1.0
 * @date 2022/7/4 15:11
 */
@Data
@Accessors(chain = true)
public class LoginInfo {

	private String password;

	private String username;

}


