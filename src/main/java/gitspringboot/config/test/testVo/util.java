package gitspringboot.config.test.testVo;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.lang.reflect.Field;


public class util<T>{
    public void getExcel(T t){
        Workbook workbook;
        Sheet sheet;
        Row row;

        Class cls = t.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field: fields){
            
        }
    }
}
