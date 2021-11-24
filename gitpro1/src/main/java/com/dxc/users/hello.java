package com.dxc.users;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@RequestMapping(path="happy")
	public String view()
	{
		return "welcome to our webpage";
	}

}
