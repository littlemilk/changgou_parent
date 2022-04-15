package com.changgou.goods.dao;

import com.changgou.goods.pojo.Para;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ParaMapper extends Mapper<Para> {

    @Select("select * from tb_para where template_id=#{id}")
    List<Para> findByCategoryId(Integer templateId);
}
