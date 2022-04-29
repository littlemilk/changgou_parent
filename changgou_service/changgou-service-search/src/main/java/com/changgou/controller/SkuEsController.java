package com.changgou.controller;

import com.changgou.entity.Result;
import com.changgou.entity.StatusCode;
import com.changgou.service.SkuEsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/search")
@CrossOrigin
public class SkuEsController {

    @Autowired
    private SkuEsService skuEsService;

    @GetMapping("/import")
    public Result search(){
        skuEsService.importSku();
        return new Result(true, StatusCode.OK, "数据导入成功");
    }

    @PostMapping
    public Map search(@RequestBody(required = false) Map searchMap){
        return skuEsService.search(searchMap);
    }

}
