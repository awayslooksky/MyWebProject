package com.huawei.services;

import com.huawei.dao.Items;
import java.util.List;

public interface ItemService {
    //获取商品列表
    public List<Items> getItemsList() throws Exception;
}
