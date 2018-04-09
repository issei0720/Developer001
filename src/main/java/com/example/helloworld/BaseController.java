package com.example.helloworld;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public abstract class BaseController {

	private static Logger log = Logger.getLogger(BaseController.class);

	//	@ModelAttribute // (1)
//	public EchoForm setUpEchoForm() {
//	    EchoForm form = new EchoForm();
//	    return form;
//	}
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		try {
		    // 例外が発生する可能性のある処理
			String a = "テスト";
			log.info(a); //2016/07/21 22:50:24.975 [main] INFO   テスト


		} catch (Exception e) {
		    // 例外が発生した場合の処理(例外が発生しなければ行われない処理)
		} finally {
		    // 例外の有無に関わらず、最後に必ず実行される処理
		}
	}
}
