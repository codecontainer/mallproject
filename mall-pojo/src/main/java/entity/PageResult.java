package entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 白色馒头
 * Date: 2018-07-28
 * Time: 14:44
 *
 * 封装分页结果类
 */
public class PageResult implements Serializable{
    private long total;
    private List rows; //当前类结果

    public PageResult(List rows, long total) {
        super();
        this.rows = rows;
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
