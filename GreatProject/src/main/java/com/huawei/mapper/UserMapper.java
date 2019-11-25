package com.huawei.mapper;

import com.huawei.dao.SC;

import java.util.List;

public interface UserMapper {
    public List<SC> getScBySid(String sid) throws Exception;
}
