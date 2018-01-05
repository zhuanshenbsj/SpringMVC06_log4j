package com.wcxu.log;

import org.apache.log4j.Logger;

public class MyOutputBean {

	// 获取Logger日志器对象
	static Logger log = Logger.getLogger(MyOutputBean.class);

	public static void main(String[] args) {
		log.debug("调试信息");
		log.info("普通信息");
		log.warn("警告信息");
		log.error("错误信息");
		log.fatal("致命错误信息");
	}

}
