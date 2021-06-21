package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import utils.ValidateCode;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RespectBinding;

@Controller
@RequestMapping("/code")
public class CodeController {

    @RequestMapping(value="/getCode")
    public void getCode(@RequestParam(value = "time") String time, HttpServletRequest request, HttpServletResponse response) {
        ValidateCode code = new ValidateCode(100, 30, 4, 30, 25, "validateCode");
        code.getCode(request, response);

    }
    @RequestMapping(value="/checkCode")
    @ResponseBody
    public Map<String,Object> cherkCode(String verify,HttpSession session){
    	String sessionCode = (String) session.getAttribute("validateCode");
    	Map<String, Object> hashMap = new HashMap<String,Object>();
    	if(verify !=null && verify.equalsIgnoreCase(sessionCode)) {
    		hashMap.put("statusCode", 200);
    		hashMap.put("message", "验证码正确");
    	}else {
    		hashMap.put("statusCode", 500);
    		hashMap.put("message", "验证码错误");
    	}
    	return hashMap;
    }
}
