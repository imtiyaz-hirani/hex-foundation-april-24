package com.service;

import java.util.LinkedList;
import java.util.Queue;

import com.model.Policy;

public class PolicyService {

	public Policy[] getAllPolicies() {
		Policy p1 = new Policy(1,"Jeevan Anand",21,30,30000); 
		
		Policy p2 = new Policy(); 
		p2.setId(2);
		p2.setName("Jeevan Suraksha");
		p2.setDuration(25);
		p2.setPremium(20000);
		p2.setAge(30);
		
		Policy p3 = new Policy(); 
		p3.setId(3);
		p3.setName("Jeevan Aayog");
		p3.setDuration(20);
		p3.setPremium(22000);
		p3.setAge(18);
		
		Policy p4 = new Policy(); 
		p4.setId(4);
		p4.setName("Jeevan Labh");
		p4.setDuration(40);
		p4.setPremium(10000);
		p4.setAge(1);
		
		Policy[] arry = {p1,p2,p3,p4};
		return arry;
	}

	public Queue<Policy> recommendPolicyByAge(Policy[] policies, int age) {
		//iterate over policies. if(age>policy.age ) then show that policy-put it in temp array 
		Queue<Policy> queue = new LinkedList<>();
		for( Policy p: policies) { //p=p1, p=p2, p=p3, p=p4
			if(age <= p.getAge())
				queue.add(p);
		}
		return queue;
	}

}
