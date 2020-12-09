package com.clearminds.arm.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.arm.dtos.Estudiante;
import com.clearminds.arm.excepciones.BDDException;
@Path("/estudiantes")
public class RestEstudiantes {
/*	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante est){
		System.out.println(est);
		
	}
	*/
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estu){
		ServicioEstudiante srv = new ServicioEstudiante();
		try {
			srv.insertarEstudiante(estu);
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Path("/actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estu){
		ServicioEstudiante srv = new ServicioEstudiante();
		try {
			srv.actualizarEstudiante(estu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
