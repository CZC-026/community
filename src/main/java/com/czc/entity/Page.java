package com.czc.entity;
/*
封装分页相关的信息
 */
public class Page {
    //当前页码
    private int current = 1; //默认
    //每页显示上限
    private int limit = 10;
    //数据总数
    private int rows;
    //查询路径(点击页面跳转，复用分页连接）
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current >= 1){
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >= 1 && limit <= 100){
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /*
    获取当前页的起始行
     */
    public int getOffset(){
        return (current - 1) * limit;
    }
    /*
    获取总页数
     */
    public int getTotal(){
        if(rows % limit == 0){
            return rows / limit;
        }else {
            return rows / limit + 1;
        }
    }
    /*
    * 获取显示的起始和结束页码
     */
    public int getFrom(){
        if(current - 2 < 1){
            return 1;
        }else {
            return current - 2;
        }
    }
    public int getTo(){
        int total = getTotal();
        if(current + 2 > total){
            return total;
        }else {
            return current + 2;
        }
    }

}
