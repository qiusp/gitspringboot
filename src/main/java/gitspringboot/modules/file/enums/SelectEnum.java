package gitspringboot.modules.file.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author renz
 * @version 1.0
 * @date 2022/3/3 18:22
 */
@Getter
@AllArgsConstructor
public enum SelectEnum {

	A(1,"A、"),
	B(2,"B、"),
	C(3,"C、"),
	D(4,"D、");

	private Integer key;
	private String value;

	public static List<String> getSelectValue(){
		List<String> unitList = new ArrayList<>();
		for (SelectEnum val : SelectEnum.values()) {
			unitList.add(val.getValue());
		}
		return unitList;
	}

}
