package com.anurag.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anurag.springmvc.modal.Person;
import com.anurag.springmvc.service.PersonService;

@Controller
@RequestMapping("/userTest")
public class IndexController {

	@Autowired PersonService personService;
     @RequestMapping(method = RequestMethod.GET)
       public String getIndexPage() {
    	 try{
    		List <Person> all = personService.getPersons();
    		 if(null !=all){
    			 System.out.println(all.size());
    			 
    			 System.out.println(((Person)all.get(0)).getFirstName());
    		 }
    		 
    	 }catch(Exception e){
    		 
    		 e.printStackTrace();
    	 }
           return "UserManagement";
       }

}