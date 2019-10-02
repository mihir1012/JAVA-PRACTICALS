/*Write a simple java application that creates a Player class. Inherit
CricketPlayer class from Player class. Inherit Batsman & Bowler classes from
CricketPlayer class. Assume suitable data and member methods.*/

class Player
{
	private String playerName;
	private int age;
	private String gameName;
	

	void getData(String name, int age, String game)
	{
		playerName = name;
		this.age = age;
		gameName = game; 
	}
	
	void Display()
	{
		System.out.println("player Information :");
		System.out.println("Name "+ playerName + " Age "+ age +" Game " + gameName);
		
	}
}

class CricketPlayer extends Player
{
	private String TeamName;
	private String playerType;
	
	void getData(String Name,int age, String game, String team, String Type)
	{
		super.getData(Name,age,game);
		TeamName = team;
		playerType = Type; 
	}
	
	void Display()
	{
		super.Display();
		System.out.println("Cricket Player Information:");
		System.out.println("Team name :" + TeamName + " Player Type : " + playerType);
	}	
}

class Batsman extends CricketPlayer
{
	int NumberInnings;
	int tRuns;
	double Strikerate;
	
	void Display()
	{
		super.Display();
		System.out.println("Batsman Information:");
		System.out.println("Number of innings " + NumberInnings+" Total Runs " + tRuns +" Strike Rate" + Strikerate);
	}
	
	void getData(String Name,int age, String game, String team, String Type, int innings,int runs)
	{
		super.getData(Name,age,game,team,Type);
		NumberInnings = innings;
		tRuns = runs;
		
		Strikerate =(double)tRuns/NumberInnings;
	}
}

class Bowler extends CricketPlayer
{
	int NumberInnings;
	int tWickets;
	double Runrate;
}

class u4p1
{
	public static void main(String args[])
	{
			Batsman Bs1 = new Batsman();
			Bowler Bw1 = new Bowler();
			
			Bs1.getData("Mihir",34,"Cricket","India","Batsman",100,10000);
			Bs1.Display();
			
			Bw1.getData("Mihir",34,"Cricket","India","Bowler",100,10000);
			Bw1.Display();
	}
}
