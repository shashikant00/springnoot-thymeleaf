package com.coursecube.springboot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class BooksController {

	@GetMapping("/showBooks")
	public String getBooks(HttpSession session) {
		System.out.println("BooksController - getBooks()");
		
		List<Book> blist=new ArrayList<>();
		
		Book mybook1=new Book(101,"Mater Spring Boot",
				"Srinivas Dande", BigDecimal.valueOf(10000.0),"JLC");
		
		Book mybook2=new Book(102,"Mater MicroServices",
				"Srinivas Dande", BigDecimal.valueOf(10000.0),"JLC");
		
		Book mybook3=new Book(103,"Mater Angular",
				"Srinivas Dande", BigDecimal.valueOf(10000.0),"JLC");
		
		Book mybook4=new Book(104,"Mater React",
				"Srinivas Dande", BigDecimal.valueOf(10000.0),"JLC");
		
		Book mybook5=new Book(105,"Mater Java Full Stack",
				"Srinivas Dande", BigDecimal.valueOf(10000.0),"JLC");
		
		blist.add(mybook1);blist.add(mybook2);
		blist.add(mybook3);
		blist.add(mybook4);
		blist.add(mybook5);
		
		session.setAttribute("MyBooks", blist);
		
		return "booksList";
	}
}
