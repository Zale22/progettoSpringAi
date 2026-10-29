package com.example.demo.model;

public enum Marca {
    APPLE("Apple"),
    SAMSUNG("Samsung"),
    HUAWEI("Huawei");


    private final String value;

    Marca(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


/*switch (marca) {
    case computer.Marca.APPLE:
        return "Apple";
    case SAMSUNG:
        return "Samsung";
    case HUAWEI:
        return "Huawei";
    default:
        throw new IllegalArgumentException("Marca non valida: " + marca);
}*/