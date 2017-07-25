package ${basepackage}.common.annotation;

/**
 * 错误码枚举
 * Created by itfuyun（itfuyun@outlook.com）
 */
public enum ErrorCode {
    OK(0),
    FAIL(1),
    INVALID_PARAMETER(100),
    UNAUTHORIZED(401),
    SERVICE_UNAVAILABLE(500);

    private int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int CODE() {
        return this.code;
    }
}
