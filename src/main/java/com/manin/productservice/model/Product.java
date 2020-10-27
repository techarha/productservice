package com.manin.productservice.model;

import io.swagger.annotations.ApiModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * TODO: features field needs to be added.
 */

@ApiModel(description = "Defines a Product")
@Document
public class Product {
    // TODO: should have a generation strategy ?,  maybe a Brand-productName-subCategory
    @Id
    private String id;
    @NotNull(message = "Category can't be null")
    private String category;
    @NotNull(message = "Sub Category can't be null")
    private String subCategory;
    @NotNull(message = "Brand can't be null")
    private String brand;
    @NotNull(message = "Product name can't be null")
    private String productName;
    private String size;
    @NotNull(message = "Marp can't be null")
    private BigDecimal mrp;
    private String hsnCode;
    @NotNull(message = "Gst Tax Code can't be null")
    private ProductGstCode gstTaxCode;
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

    public ProductGstCode getGstTaxCode() {
        return gstTaxCode;
    }

    public void setGstTaxCode(ProductGstCode gstTaxCode) {
        this.gstTaxCode = gstTaxCode;
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
