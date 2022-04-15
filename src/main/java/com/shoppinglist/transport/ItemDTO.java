package com.shoppinglist.transport;

import com.shoppinglist.bean.MeasureEnum;

public class ItemDTO {
    private Long id;
    private String name;
    private MeasureEnum unityType;

    public ItemDTO(String name, MeasureEnum unityType, Integer quantity) {
        this.name = name;
        this.unityType = unityType;
        this.quantity = quantity;
    }

    public ItemDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MeasureEnum getUnityType() {
        return unityType;
    }

    public void setUnityType(MeasureEnum unityType) {
        this.unityType = unityType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    private Integer quantity;

    @Override
    public String toString() {
        return quantity + " " + unityType.getDescricao() + " " + name;
    }
}
