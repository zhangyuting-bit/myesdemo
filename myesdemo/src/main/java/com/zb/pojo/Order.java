package com.zb.pojo;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;
    private String title;
    private String ship_mobile;
    private String ship_addr;
    private String create_time;
    private String end_time;
    private Integer type_num;
    private Integer type_level1;
    private Integer type_level2;
    private Integer type_level3;
    private Integer goods_num;
    private String name;
    //增加一个属性
    private String haha;

    //组员2也修改了
    private String zuyuan2;

    //组员1修改内容
    //组员1 2.29号再次修改代码
    private String zuyuan1;

    public String getHaha() {
        return haha;
    }

    public void setHaha(String haha) {
        this.haha = haha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShip_mobile() {
        return ship_mobile;
    }

    public void setShip_mobile(String ship_mobile) {
        this.ship_mobile = ship_mobile;
    }

    public String getShip_addr() {
        return ship_addr;
    }

    public void setShip_addr(String ship_addr) {
        this.ship_addr = ship_addr;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public Integer getType_num() {
        return type_num;
    }

    public void setType_num(Integer type_num) {
        this.type_num = type_num;
    }

    public Integer getType_level1() {
        return type_level1;
    }

    public void setType_level1(Integer type_level1) {
        this.type_level1 = type_level1;
    }

    public Integer getType_level2() {
        return type_level2;
    }

    public void setType_level2(Integer type_level2) {
        this.type_level2 = type_level2;
    }

    public Integer getType_level3() {
        return type_level3;
    }

    public void setType_level3(Integer type_level3) {
        this.type_level3 = type_level3;
    }

    public Integer getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(Integer goods_num) {
        this.goods_num = goods_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order() {
    }

    public Order(Integer id, String title, String ship_mobile, String ship_addr, String create_time, String end_time, Integer type_num, Integer type_level1, Integer type_level2, Integer type_level3, Integer goods_num, String name) {
        this.id = id;
        this.title = title;
        this.ship_mobile = ship_mobile;
        this.ship_addr = ship_addr;
        this.create_time = create_time;
        this.end_time = end_time;
        this.type_num = type_num;
        this.type_level1 = type_level1;
        this.type_level2 = type_level2;
        this.type_level3 = type_level3;
        this.goods_num = goods_num;
        this.name = name;
    }
}
