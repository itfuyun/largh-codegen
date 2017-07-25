package ${basepackage}.common.util.result;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 返回结果
 * Created by itfuyun（itfuyun@outlook.com）
 */
@JsonInclude(JsonInclude.Include.NON_NULL)//忽略data空值
public class Result {
    private int errcode;
    private String errmsg;
    private Object data;

    public Result(int errcode, String errmsg, Object data) {
        this.errcode = errcode;
        this.errmsg = errmsg;
        this.data = data;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
