package tr.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import tr.com.entities.Person;
import tr.com.service.PersonService;

@Controller
@RequestMapping("/login")
public class LoginController {

	
	@Autowired
	private PersonService personservice;
	
	@RequestMapping(value="/userLogin.ajax")
	@ResponseBody
	public void userLogin(HttpServletRequest request, HttpServletResponse response) throws IOException{
		Person person = new Person();
		
		JSONObject prsn = new JSONObject();
		JSONArray data = new JSONArray();
		JSONObject result = new JSONObject();
		
		person.setName(request.getParameter("name"));
		person.setEmail(request.getParameter("email"));
		
		try {
			personservice.addPerson(person);
			List<Person> personList = personservice.getAllPerson();
			
			for (Person person2 : personList) {
				prsn = new JSONObject();
				prsn.put("id", person2.getId());
				prsn.put("name", person2.getName());
				prsn.put("email", person2.getEmail());
				data.add(prsn);
			}
			
			result.put("success", true);
			result.put("data", data);
		} catch (Exception e) {
			result.put("success", false);
			result.put("error", e.getMessage());
			result.put("data", data);
		}
		
		response.getWriter().write(result.toString());
		
	}
	
}
