package com.xiaoyao.mapper;


import com.xiaoyao.model.Resource;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 *
 * Resource 表数据库控制层接口
 *
 */
@Repository
public interface ResourceMapper extends Mapper<Resource> {

}