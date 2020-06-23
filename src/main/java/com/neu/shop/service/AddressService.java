package com.neu.shop.service;

import com.neu.shop.pojo.Address;
import com.neu.shop.pojo.AddressExample;

import java.util.List;


public interface AddressService {
    public List<Address> getAllAddressByExample(AddressExample addressExample);

    public void updateByPrimaryKeySelective(Address address);

    public void deleteByPrimaryKey(Integer addressid);

    public void insert(Address address);

    public void  insertSelective(Address address);

    public Address selectByPrimaryKey(Integer addressid);
}
