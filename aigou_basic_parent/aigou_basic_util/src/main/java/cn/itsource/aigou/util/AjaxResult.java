package cn.itsource.aigou.util;

public class AjaxResult {

    private Boolean success = true;

    private String msg = "操作成功";
    //返回数据封装到object对象中
    private Object object;

    //链式编程
    public static void main(String[] args) {
        AjaxResult.me().setSuccess(false).setMsg("操作失败").setObject("1234再来一次");
    }
    public static AjaxResult me() {

        return new AjaxResult();
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
