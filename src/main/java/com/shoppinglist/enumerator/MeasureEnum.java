package com.shoppinglist.enumerator;

public enum MeasureEnum {
    UNIDADES("Unidades"),
    KILOS("Kilos"),
    LITROS("Litros"),
    GARRAFAS("Garrafas"),
    PACOTES("Pacotes");

    private String descricao;

    MeasureEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
