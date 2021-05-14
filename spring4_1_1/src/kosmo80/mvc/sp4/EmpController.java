package kosmo80.mvc.sp4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmpController extends MultiActionController {

		public ModelAndView getEmpList(HttpServletRequest req
										, HttpServletResponse res) {
			
			ModelAndView mav = new ModelAndView();                    
			/*
			 * <property name="prefix" value="/WEB-INF/views/"/> <property name="prefix"
			 * value=".jsp/"/>
			 */
			mav.setViewName("di/getEmpList");
			return mav;
		}
			
}
