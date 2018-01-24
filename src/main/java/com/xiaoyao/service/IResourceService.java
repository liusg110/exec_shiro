package com.xiaoyao.service;

import com.xiaoyao.model.Resource;

import java.util.List;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
public interface IResourceService {
    /**
    * @Description: 获取所有资源列表
    * @author: lsg
    * @date:  2017/12/16
    */
    List<Resource> selectAll();

/*    List<Tree> selectAllMenu();

    List<Tree> selectAllTree();*/
}
