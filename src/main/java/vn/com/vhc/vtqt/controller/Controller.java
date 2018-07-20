package vn.com.vhc.vtqt.controller;

import org.springframework.web.bind.annotation.RestController;

import vn.com.vhc.vtqt.service.MasterService;

import java.security.NoSuchAlgorithmException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {
	
	MasterService service = new MasterService();

	@RequestMapping(value = "/getQuery", method = RequestMethod.GET)
	public String Overview(
			@RequestParam(value = "msg_type", required = true) String msg_type,
			@RequestParam(value = "para", required = true) String para,		
			@RequestParam(value = "type", required = true) String type)		
					throws SQLException  {
		CallableStatement stmt = service.connection.prepareCall("{call PK_SUMMARY_WS.REPORT_WS(?, ?, ?, ?)");
		stmt.setString(1, msg_type);
		stmt.setString(2, para);
		stmt.setString(3, type);
		stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
		
		// Execute
		stmt.execute();
		
		// Get Result
		String reslut = stmt.getString(4);
		return reslut;
		
		
	}

	
}
