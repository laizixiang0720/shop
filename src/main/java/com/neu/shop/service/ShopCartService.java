package com.neu.shop.service;

import com.neu.shop.pojo.ShopCart;
import com.neu.shop.pojo.ShopCartExample;
import com.neu.shop.pojo.ShopCartKey;

import java.util.List;


public interface ShopCartService {
    public void addShopCart(ShopCart shopCart);

    public List<ShopCart> selectByExample(ShopCartExample shopCartExample);

    public void deleteByKey(ShopCartKey shopCartKey);

    public void updateCartByKey(ShopCart shopCart);

    public ShopCart selectCartByKey(ShopCartKey shopCartKey);
}
