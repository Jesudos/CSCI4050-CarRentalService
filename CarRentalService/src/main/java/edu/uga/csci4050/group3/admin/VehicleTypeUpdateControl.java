package edu.uga.csci4050.group3.admin;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import edu.uga.csci4050.group3.core.InvalidInputException;
import edu.uga.csci4050.group3.core.InvalidUrlException;
import edu.uga.csci4050.group3.core.VehicleTypeEntity;
import edu.uga.csci4050.group3.db.DatabaseAbstraction;

public class VehicleTypeUpdateControl {

	public void update(HttpServletRequest request) throws InvalidInputException, InvalidUrlException{
		// Load type data from form
		VehicleTypeEntity type = new VehicleTypeEntity();
		
		type.loadFromForm(request.getParameterMap());
		
		// Get UID from URL
		Map<String, String[]> params = request.getParameterMap();
		
		if(!params.containsKey("uid")){
			throw new InvalidUrlException();
		}
		
		type.setUid(params.get("uid")[0]);
		
		// Validate form data
		type.validate();
		
		// Send to database
		DatabaseAbstraction.putVehicleType(type);
	}
}
