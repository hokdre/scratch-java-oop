package example.application;

// import specific class
// to import all class you can use *
// import example.model.*;
// all class on java.lang is automatic import

import example.model.Handphone;
import example.model.Product;
public class ProductApplication {
    Product product = new Product("kerupuk", 50_000);
    Product handphone = new Handphone("handphone", 5_000_000);
}
