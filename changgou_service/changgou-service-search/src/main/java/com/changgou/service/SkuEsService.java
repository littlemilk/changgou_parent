package com.changgou.service;

import java.util.Map;

public interface SkuEsService {
    /***
     * 导入SKU数据
     */
    void importSku();

    Map search(Map<String, String> searchMap);
}
