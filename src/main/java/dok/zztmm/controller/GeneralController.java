package dok.zztmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {
	/* *
	 * AutoWired zone
	 * */
	
	
	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
}
