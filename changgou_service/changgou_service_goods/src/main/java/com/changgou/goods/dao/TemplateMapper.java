package com.changgou.goods.dao;

import com.changgou.goods.pojo.Template;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TemplateMapper extends Mapper<Template> {

    @Select("select * from tb_template where id = #{id}")
    Template findByCategoryId(@Param("id")int id);
}
