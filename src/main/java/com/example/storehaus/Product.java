package com.example.storehaus;

public class Product {
    private String productName;
    private String barcode;
    private String placeOnStorehaus;
    private String number;
    private String numberInStorage;

    public Product(String productName, String barcode, String placeOnStorehaus, String number, String numberInStorage) {
        this.productName = new String(productName);
        this.barcode = new String(barcode);
        this.placeOnStorehaus = new String(placeOnStorehaus);
        this.number = new String(number);
        this.numberInStorage = new String(numberInStorage);
    }

    public Product() {

    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setPlaceOnStorehaus(String placeOnStorehaus) {
        this.placeOnStorehaus = placeOnStorehaus;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setNumberInStorage(String numberInStorage) {
        this.numberInStorage = numberInStorage;
    }

    public String getProductName() {
        return productName;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getPlaceOnStorehaus() {
        return placeOnStorehaus;
    }

    public String getNumber() {
        return number;
    }

    public String getNumberInStorage() {
        return numberInStorage;
    }
}
