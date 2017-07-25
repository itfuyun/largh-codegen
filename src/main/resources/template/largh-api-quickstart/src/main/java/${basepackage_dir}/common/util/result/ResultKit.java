package ${basepackage}.common.util.result;


import ${basepackage}.common.annotation.ErrorCode;

/**
 * 结果处理工具
 * Created by itfuyun（itfuyun@outlook.com）
 */
public class ResultKit {


    public static Result OK(int errcode, String errmsg, Object data) {
        return resp(errcode, errmsg, data);
    }

    public static Result OK(String errmsg, Object data) {
        return OK(ErrorCode.OK.CODE(), errmsg, data);
    }

    public static Result OK(Object data) {
        return OK("ok", data);
    }

    public static Result OK() {
        return OK(null);
    }

    public static Result FAIL(int errcode, String errmsg) {
        return resp(errcode, errmsg, null);
    }

    public static Result FAIL(String errmsg) {
        return FAIL(ErrorCode.FAIL.CODE(), errmsg);
    }

    public static Result FAIL() {
        return FAIL("fail");
    }

    private static Result resp(int errcode, String errmsg, Object data) {
        return new Result(errcode, errmsg, data);
    }
}
