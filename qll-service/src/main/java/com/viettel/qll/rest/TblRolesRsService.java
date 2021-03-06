package com.viettel.qll.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.viettel.qll.dto.TblUsersDTO;

/**
 * @author hailh10
 */
 
public interface TblRolesRsService {

	
	
	@POST
	@Path("/selectRoles")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response selectRoles() throws Exception;

	
}
