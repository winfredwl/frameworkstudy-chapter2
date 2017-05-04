package org.smart4j.chapter2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.chapter2.helper.DataBaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.util.PropertiesUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 客户数据服务
 *
 * @author Winfred.Wang
 * @since 2017.05.03
 */
public class CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DataBaseHelper.queryEntityList(Customer.class, sql);

    }

    /**
     * 获取客户
     *
     * @param id    客户id
     * @return      客户
     */
    public Customer getCustomer(Long id) {
        String sql = "SELECT * FROM customer WHERE id = " + id;
        return DataBaseHelper.queryEntity(Customer.class, sql);
    }

    /**
     * 创建客户
     *
     * @param fieldMap  字段
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DataBaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     *
     * @param id    客户id
     * @param fieldMap  字段
     */
    public boolean updateCustomer(Long id, Map<String, Object> fieldMap) {
        return DataBaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     *
     * @param id    客户id
     */
    public boolean deleteCustomer(Long id) {
        return DataBaseHelper.deleteEntity(Customer.class, id);
    }
}
