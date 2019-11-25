package com.huawei.services;

import com.huawei.dao.Items;
import com.huawei.mapper.ItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    //让spring框架自动注入mapper接口的代理对象
    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public List<Items> getItemsList() throws Exception {
        List<Items> itemList = itemsMapper.getItemList();
        return itemList;
    }
}
