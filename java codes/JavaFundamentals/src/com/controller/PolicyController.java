package com.controller;

import java.util.Queue;
import java.util.Scanner;

import com.model.Policy;
import com.service.PolicyService;

public class PolicyController {

	public static void main(String[] args) {
		PolicyService policyService = new PolicyService();
		Scanner sc = new Scanner(System.in);
		
		Policy[] policies =  policyService.getAllPolicies();
		
		System.out.println("----------All Policies-------------");
		for(Policy p : policies) {
			System.out.println(p);
		}
		
		System.out.println("--------------------------");
		System.out.println("Enter your age");
		int age = sc.nextInt();
		Queue<Policy> recommendedPolicies =  policyService.recommendPolicyByAge(policies,age);
		
		System.out.println("----------Recommended Policies-------------");
		for(Policy p : recommendedPolicies) {
			System.out.println(p.getId() + ":" + p.getName() + ":" + p.getAge() + ":"+p.getDuration());
		}
		
		sc.close();
	}

}
