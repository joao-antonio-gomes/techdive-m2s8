package com.shoppinglist.transport;

import com.shoppinglist.enumerator.MeasureEnum;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.validation.constraints.NotEmpty;

public class ItemDTO {
    private Long id;

    @NotEmpty(message = "{item.name.notempty}")
    private String name;
    private MeasureEnum unityType;
    private float quantity;

    public ItemDTO(String name, MeasureEnum unityType, float quantity) {
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

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity + " " + unityType.getDescricao() + " " + name;
    }
}
