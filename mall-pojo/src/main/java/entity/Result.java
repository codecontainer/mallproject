package entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 白色馒头
 * Date: 2018-08-07
 * Time: 15:40
 */
public class Result implements Serializable {
    public Result(String message, boolean success) {
        super();
        this.message = message;
        this.success = success;
    }

    public Result(String message) {
        this.message = message;
    }

    private boolean success;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
