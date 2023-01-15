package com.dailycodebuffer.Springboot.tutorial.error;

/* @Auther: wuyang
 * @Date: 2023/01/12/23:09
 * @Description:
 */
public class DepartmentNotFoundException extends Exception{
    public DepartmentNotFoundException() {
        super();
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }

    public DepartmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNotFoundException(Throwable cause) {
        super(cause);
    }

    protected DepartmentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}