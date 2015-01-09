package ctec.gofishandroid.Model;

import ctec.gofishandroid.R;
import ctec.gofishandroid.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class GoFishModel extends Activity
{
	public int dogeCards;
	public int brianCards;
	public int dreamsCards;
	public int aloneCards;
	public int josephCards;
	public int raptorCards;
	public int dylanCards;
	public int fryCards;
	public int simplyCards;
	public int sanicCards;
	public int[] cardDeck;
	public int[] handOne;
	public int[] handTwo;

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		buildCardsArray();
		buildHandOneArray();
		buildHandTwoArray();
	}

	private void buildCardsArray()
	{
		int[] cardDeck = new int[9];

	}

	public void moveCards(int cardSlot, int From, int To)
	{
		if (From == 0)
		{
			cardSlot = RandomGenerater();
			
			if (To == 1)
			{
				cardDeck[cardSlot] = cardDeck[cardSlot] - 1;
				handOne[cardSlot] = handOne[cardSlot] + 1;
			}
			else
			{
				cardDeck[cardSlot] = cardDeck[cardSlot] - 1;
				handTwo[cardSlot] = handTwo[cardSlot] + 1;
			}
		}
		else if (From == 1)
		{
			handOne[cardSlot] = handOne[cardSlot] - 1;
			handTwo[cardSlot] = handTwo[cardSlot] + 1;
		}
		else
		{
			handTwo[cardSlot] = handTwo[cardSlot] - 1;
			handOne[cardSlot] = handOne[cardSlot] + 1;
		}
	}
	
	private int RandomGenerater()
	{
		int randomNumber = -1;
		boolean isDone = false;
		while(!isDone)
		{
			randomNumber = (int) (Math.random() * 10);
			if(cardDeck[randomNumber] != 0)
			{
				isDone = true;
			}
			
		}
		return randomNumber;
	}

	private void buildHandOneArray()
	{
		int[] handOne = new int[9];
	}

	public void setHandOne(int cardSlot, Boolean Op)
	{
		if (Op)
		{
			handOne[cardSlot] = handOne[cardSlot] + 1;
		}
		else
		{
			handOne[cardSlot] = handOne[cardSlot] - 1;
		}
	}

	private void buildHandTwoArray()
	{
		int[] handTwo = new int[9];
	}

	public void setHandTwo(int cardSlot, Boolean Op)
	{
		if (Op)
		{
			handOne[cardSlot] = handOne[cardSlot] + 1;
		}
		else
		{
			handOne[cardSlot] = handOne[cardSlot] - 1;
		}
	}

	public int getDogeCards()
	{
		return dogeCards;
	}

	public void setDogeCards(int dogeCards)
	{
		this.dogeCards = dogeCards;
	}

	public int getBrianCards()
	{
		return brianCards;
	}

	public void setBrianCards(int brianCards)
	{
		this.brianCards = brianCards;
	}

	public int getDreamsCards()
	{
		return dreamsCards;
	}

	public void setDreamsCards(int dreamsCards)
	{
		this.dreamsCards = dreamsCards;
	}

	public int getAloneCards()
	{
		return aloneCards;
	}

	public void setAloneCards(int aloneCards)
	{
		this.aloneCards = aloneCards;
	}

	public int getJosephCards()
	{
		return josephCards;
	}

	public void setJosephCards(int josephCards)
	{
		this.josephCards = josephCards;
	}

	public int getRaptorCards()
	{
		return raptorCards;
	}

	public void setRaptorCards(int raptorCards)
	{
		this.raptorCards = raptorCards;
	}

	public int getDylanCards()
	{
		return dylanCards;
	}

	public void setDylanCards(int dylanCards)
	{
		this.dylanCards = dylanCards;
	}

	public int getFryCards()
	{
		return fryCards;
	}

	public void setFryCards(int fryCards)
	{
		this.fryCards = fryCards;
	}

	public int getSimplyCards()
	{
		return simplyCards;
	}

	public void setSimplyCards(int simplyCards)
	{
		this.simplyCards = simplyCards;
	}

	public int getSanicCards()
	{
		return sanicCards;
	}

	public void setSanicCards(int sanicCards)
	{
		this.sanicCards = sanicCards;
	}
}
