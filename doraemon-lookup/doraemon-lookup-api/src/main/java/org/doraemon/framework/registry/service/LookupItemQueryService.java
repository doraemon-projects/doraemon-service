package org.doraemon.framework.registry.service;

import org.doraemon.framework.Constants;
import org.doraemon.framework.exception.ApplicationException;
import org.doraemon.framework.registry.vo.LookupItemVO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * @description: 描述
 * @author: fengwenping
 * @date: 2020-04-12 18:10
 */
@Path("/items/query")
@Produces({Constants.ContentType.APPLICATION_JSON_UTF_8, Constants.ContentType.APPLICATION_XML_UTF_8})
@Consumes({Constants.ContentType.APPLICATION_JSON_UTF_8, Constants.ContentType.APPLICATION_XML_UTF_8})
public interface LookupItemQueryService {
    /**
     * 查询明细项
     *
     * @param lookupItemVO
     * @return
     * @throws ApplicationException
     */
    @POST
    @Path("")
    List<LookupItemVO> queryLookupItems(LookupItemVO lookupItemVO) throws ApplicationException;
}
