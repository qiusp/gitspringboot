package gitspringboot.modules.file.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class PptxVO implements Serializable{

    /**
     * 标题
     */
    private String title;

    /**
     * 标题
     */
    private String a;

    /**
     * 标题
     */
    private String b;

    /**
     * 标题
     */
    private String c;

    /**
     * 标题
     */
    private String d;

    /**
     * 标题
     */
    private Integer count;

}
