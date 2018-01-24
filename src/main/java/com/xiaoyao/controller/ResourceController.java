package com.xiaoyao.controller;

import com.xiaoyao.service.IResourceService;
import com.xiaoyao.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
@RestController
@RequestMapping(value = "Resource")
public class ResourceController {
    @Autowired
    private IResourceService resourceService;
    @RequestMapping(value = "treeGrid")
    public String treeGrid(){
        return JsonUtils.toJson(resourceService.selectAll());
    }

}
