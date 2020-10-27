package com.manin.productservice.model;

public enum ProductGstCode {
    //TODO: update values after proper study for names and their values.
    GST_0(0),
    GST_1(3),
    GSTR_2(5),
    GSTR_3(12),
    GSTR_4(18),
    GST_5(28);

    private Integer value;

    ProductGstCode(Integer s) {
        this.value = s;
    }

    public Integer getGstCodeValue() {
        return value;
    }
}
