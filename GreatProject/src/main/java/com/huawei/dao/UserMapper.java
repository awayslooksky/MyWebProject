package com.huawei.dao;

import java.util.List;

public interface UserMapper {
    public List<SC> getScBySid(String sid) throws Exception;
}
