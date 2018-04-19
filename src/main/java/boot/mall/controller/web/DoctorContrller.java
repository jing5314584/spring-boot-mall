package boot.mall.controller.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.mall.controller.result.ExceptionMsg;
import boot.mall.controller.result.ResponseData;
import boot.mall.mybatis.mapper.DoctorMapper;
import boot.mall.mybatis.model.Doctor;
import boot.mall.mybatis.model.DoctorExample;

import com.alibaba.fastjson.JSON;

@RestController
public class DoctorContrller {
	private static Logger logger = LoggerFactory
			.getLogger(DoctorContrller.class);
	@Autowired
	private DoctorMapper doctorMapper;
	@RequestMapping(value = "getDoctorListByPage")
	public ResponseData searchByKey(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("getDoctorListByPage Handler,Parameter="
				+ JSON.toJSONString(request.getParameterMap()));

		Integer currentPage = 1;
		
		try {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		} catch (Exception e) {

		}

		int findSize = 20;
		int offSize = (currentPage - 1) * findSize;
		DoctorExample doctorInfoExample = new DoctorExample();
		doctorInfoExample.createCriteria()
				.andIsShowEqualTo(true).andIsDeleteEqualTo(false)
				.andIsAssistantEqualTo(false);
		doctorInfoExample.setOrderByClause("view_order desc, user_idx limit "
				+ offSize + ", " + findSize);
		List<Doctor> doctorList = doctorMapper
				.selectByExample(doctorInfoExample);
		return new ResponseData(ExceptionMsg.SUCCESS, doctorList);

	}
	@RequestMapping(value = "getDoctorListCount")
	public ResponseData getDoctorListCount(HttpSession session,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("getDoctorListCount Handler,Parameter="
				+ JSON.toJSONString(request.getParameterMap()));

		DoctorExample doctorInfoExample = new DoctorExample();
		doctorInfoExample.createCriteria()
				.andIsShowEqualTo(true).andIsDeleteEqualTo(false)
				.andIsAssistantEqualTo(false);
		int totalCount = doctorMapper.countByExample(doctorInfoExample);
		
		return new ResponseData(ExceptionMsg.SUCCESS, totalCount);

	}
}
