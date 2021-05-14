package kosmo80.mvc.sp4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmpController extends MultiActionController {

		public ModelAndView getEmpList(HttpServletRequest req
										, HttpServletResponse res) {
			Logger logger = Logger.getLogger(EmpController.class);
			private EmpLogic empLogic = null;
			//setter 객체 주입 코드
			
			 List<Map<String, Object>> empList = new ArrayList<>();
			 Map<String, Object> rmap = new HashMap<>();
			 rmap.put()
			ModelAndView mav = new ModelAndView();                    
			/*
			 * <property name="prefix" value="/WEB-INF/views/"/> <property name="prefix"
			 * value=".jsp/"/>
			 */
			mav.setViewName("di/getEmpList");
			return mav;
		}
			
}
