package utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import models.Rule;

public class RuleLoader {
	
	public List<Rule> loadRules(String filename)
	{
		//specifying the file to be used
		File rulesFile = new File(filename);
		In inRules = new In(rulesFile);
		
		//the values will be seperated by the colons that are in the file
		String delims = ":";
		List<Rule> rules = new ArrayList<Rule>();
		while(!inRules.isEmpty())
		{
			//takes in the entire line as a string
			String ruleDetails = inRules.readLine();
			//splits the line into tokens using the colon
			String[] ruleTokens = ruleDetails.split(delims);
			if (ruleTokens.length == 4)
			{
				//parses the first string as an integer
				Integer ruleNumber = Integer.parseInt(ruleTokens[0]);
				//leaves the second string as is
				String ruleQuestion = ruleTokens[1];
				//parses the third string as an integer
				Integer ruleYes = Integer.parseInt(ruleTokens[2]);
				//parses the fourth string as an integer
				Integer ruleNo = Integer.parseInt(ruleTokens[3]);
				//creates new rule object with information gathered
				rules.add(new Rule(ruleNumber, ruleQuestion, ruleYes, ruleNo));
			}
		}
		return rules;
	}

}
