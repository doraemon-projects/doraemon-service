package org.doraemon.framework.lookup.service.impl;

import org.doraemon.framework.base.dao.BaseMapper;
import org.doraemon.framework.base.service.impl.BaseServiceImpl;
import org.doraemon.framework.exception.ApplicationException;
import org.doraemon.framework.lookup.bean.LookupClassify;
import org.doraemon.framework.lookup.mapper.LookupClassifyMapper;
import org.doraemon.framework.lookup.service.LookupClassifyQueryService;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @description: 描述
 * @author: fengwenping
 * @date: 2020-04-12 16:18
 */
@Named(value = "lookupClassifyQueryServiceImpl")
public class LookupClassifyQueryServiceImpl extends BaseServiceImpl<LookupClassify, Integer> implements LookupClassifyQueryService {

    @Inject
    private LookupClassifyMapper lookupClassifyMapper;

    @Override
    public BaseMapper<LookupClassify, Integer> getDao() {
        return this.lookupClassifyMapper;
    }

    @Override
    public LookupClassify findById(String id) throws ApplicationException {
        return this.findById(id);
    }
}
