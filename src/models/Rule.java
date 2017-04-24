package models;
//This class represents each Rule read in from a file
public class Rule {

	//the rule number
	private int number;
	//the question the rule asks
	private String question;
	//rule number to go to on yes
	private int yes;
	//rule number to go to on no
	private int no;
	
	public Rule(int number, String question, int yes, int no)
	{
		this.number = number;
		this.question = question;
		this.yes = yes;
		this.no = no;
	}
	
	public String toString()
	{
		return "Rule Number= " + number + " Rule Question= " + question + " Yes= " + yes + " No= " + no;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getYes() {
		return yes;
	}

	public void setYes(int yes) {
		this.yes = yes;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
}
