package com.manin.productservice.model;

import io.swagger.annotations.ApiModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * TODO: features field needs to be added.
 */

@ApiModel(description = "Defines a Product")
@Document
public class Product {
    @Id
    private String id;
    private String category;
    private String subCategory;
    private String brand;
    private String productName;
    private String size;
    private BigDecimal mrp;
    private String hsnCode;
    private String gstInCode;
    //TODO: check, maybe we do not need any size units as of now, initially.
    private MeasurementUnit sizeUnit;
    private String capacity;
    private MeasurementUnit capacityUnit;
    private String weight;
    private MeasurementUnit weightUnit;
    private ProductStatus status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getMrp() {
        return mrp;
    }

    public void setMrp(BigDecimal mrp) {
        this.mrp = mrp;
    }

    public String getHsnCode() {
        return hsnCode;
    }

    public void setHsnCode(String hsnCode) {
        this.hsnCode = hsnCode;
    }

    public String getGstInCode() {
        return gstInCode;
    }

    public void setGstInCode(String gstInCode) {
        this.gstInCode = gstInCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public MeasurementUnit getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(MeasurementUnit sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public MeasurementUnit getCapacityUnit() {
        return capacityUnit;
    }

    public void setCapacityUnit(MeasurementUnit capacityUnit) {
        this.capacityUnit = capacityUnit;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public MeasurementUnit getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(MeasurementUnit weightUnit) {
        this.weightUnit = weightUnit;
    }
}
