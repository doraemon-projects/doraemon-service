package org.doraemon.framework.lookup.service;

import org.doraemon.framework.Constants;
import org.doraemon.framework.exception.ApplicationException;
import org.doraemon.framework.lookup.bean.LookupClassify;

import javax.ws.rs.*;

/**
 * @description: 描述
 * @author: fengwenping
 * @date: 2020-04-12 16:17
 */
@Path("/lookup/classify")
@Produces(Constants.ContentType.APPLICATION_JSON_UTF_8)
@Consumes(Constants.ContentType.APPLICATION_JSON_UTF_8)
public interface LookupClassifyQueryService {

    @GET
    @Path("/{id}")
    LookupClassify findById(@PathParam("id") String id) throws ApplicationException;
}
