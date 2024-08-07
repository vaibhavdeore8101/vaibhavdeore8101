package com.SpringCore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.bean.PlayerBean;

public class PlayerTeamMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/SpringCore/resources/PlayerTeamConfig.xml");
		PlayerBean pt= (PlayerBean) context.getBean("player1");
		
		System.out.println(pt);
		
		PlayerBean player2 = (PlayerBean) context
				.getBean("player2");

		System.out.println(player2);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
