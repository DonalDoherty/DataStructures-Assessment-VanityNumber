//This is the main class
//I did not attempt the decision tree but this class exists as the user interface part of the spec
//In lieu of the decision tree I will be using a crude arraylist system which should theoretically provide the same console output as if a tree was used
package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import utils.RuleLoader;
import models.Rule;

public class UserInterface {
	//Scanner used for input
	private Scanner input;
	//an instance of the rule loader
	public RuleLoader ruleLoader;
	//list of rules
	public List<Rule> rules;
	//the current question being asked
	private int currentRule;
	
	public UserInterface()
	{
		input = new Scanner(System.in);
		ruleLoader = new RuleLoader();
		rules = ruleLoader.loadRules("Data/rules.txt");
		//starting the rules at the first
		currentRule = 0;
	}
	
	public static void main(String[] args)
	{
		UserInterface app = new UserInterface();
		app.runMain();
	}
	
	private void runMain()
	{
		while (currentRule < 19)
		{
			//This prints the rule question
			System.out.println(rules.get(currentRule).getQuestion());
			//Tells user the viable inputs
			System.out.println("y/n");
			System.out.println("==>:  ");
			//The answer the user puts will be parsed
			String answer = input.nextLine();
			if(answer.equals("y"))
			{
				//if yes is selected it goes to the rule specified in the current rules "yes" value
				currentRule = rules.get(currentRule).getYes() -1;			
			}
			if(answer.equals("n"))
			{
				//if no is selected it goes to the rule specified in the current rules "no" value
				currentRule = rules.get(currentRule).getNo() -1;			
			}
		}
		System.out.println("Use that number");
	}
}
