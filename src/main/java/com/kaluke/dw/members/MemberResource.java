package com.kaluke.dw.members;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/member")
@Produces(MediaType.APPLICATION_JSON)
public class MemberResource {

    public MemberResource() {
    }
    
    @GET
    public Member getMember(@QueryParam("id") String id){
        
        return new Member();
        
    }

}
