/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TI.UMY.ConverterMataUang;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author TUF GAMING
 */

@Controller
public class ProjectController {
    @RequestMapping("/input")
    public String IDRtoALL(HttpServletRequest data, Model hasil) {
        
        String inputIDR = data.getParameter("var_idr");
        
        Double iIDR = Double.valueOf(inputIDR);
        
        Double IDRtoUSD = iIDR * 0.000070;
        Double IDRtoPound = iIDR * 0.000052;
        Double IDRtoRM = iIDR * 0.00029;
        
        
        hasil.addAttribute("usd", IDRtoUSD);
        hasil.addAttribute("pound", IDRtoPound);
        hasil.addAttribute("rm", IDRtoRM);
        
        return "view";       
       
    }
}
