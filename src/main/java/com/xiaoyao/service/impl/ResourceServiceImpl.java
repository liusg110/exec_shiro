package com.xiaoyao.service.impl;

import com.xiaoyao.mapper.ResourceMapper;
import com.xiaoyao.model.Resource;
import com.xiaoyao.service.IResourceService;
import org.apache.commons.codec.language.RefinedSoundex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.mapperhelper.EntityHelper;

import javax.swing.text.html.parser.Entity;
import java.util.List;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
@Service
public class ResourceServiceImpl implements IResourceService{
    @Autowired
    private ResourceMapper resourceMapper;
    /**
     * @Description: 获取所有资源列表
     * @author: lsg
     * @date:  2017/12/16
     */
    public List<Resource> selectAll() {
        Example example=new Example(Resource.class);
        example.setOrderByClause("seq desc");
        return resourceMapper.selectByExample(example);
    }
}
