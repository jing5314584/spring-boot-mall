package boot.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.mall.mybatis.mapper.RsdCircleMapper;

import com.alibaba.fastjson.JSON;

@RestController
public class TestController {
	@Autowired
	private RsdCircleMapper rsdCircleMapper;
	@Autowired
	private Sender sender;
	@RequestMapping(value = "/test")
	public String getOrder() {
		sender.send();
		return JSON.toJSONString(rsdCircleMapper.selectByPrimaryKey(1));
	}
}
