package dok.zztmm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorController {
	@ExceptionHandler(value = Exception.class)
	public String handleException(HttpServletRequest request, Exception e, Model model) throws Exception {
		model.addAttribute("exception", e);
		model.addAttribute("trace", e.getStackTrace());
		model.addAttribute("url", request.getRequestURL());
		System.out.println("error!!!!!!");
		return "error";
	}
}