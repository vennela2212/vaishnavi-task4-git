package com.mavenpro.interests;
import java.util.*;

public class App {
	// Simple Interest
		public static double simpleInterest(double principal,double rate,double time) {
			return (principal*rate*time)/100;
		}
		// Compound Interest

		public static double compoundInterest(double principal,double rate,double time){
			return principal*(Math.pow(1+rate/100, time)-1);
			}
		
		public static void main(String[] args){
		    double pr, rate, t, sim,com;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the amount:");
		    pr=sc.nextDouble();
		    System. out. println("Enter the No.of years:");
		    t=sc.nextDouble();
		    System. out. println("Enter the Rate of interest");
		    rate=sc.nextDouble();
		    sim=simpleInterest(pr,rate,t);
		    com=compoundInterest(pr,rate,t);
		    System.out.println("Simple Interest="+sim);
		    System.out. println("Compound Interest="+com);
		    sc.close();
		 }
}
