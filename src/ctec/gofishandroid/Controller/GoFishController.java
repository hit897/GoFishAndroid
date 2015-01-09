package ctec.gofishandroid.Controller;

import android.app.Activity;
import android.os.Bundle;
import ctec.gofishandroid.R;
import ctec.gofishandroid.Model.GoFishModel;

public class GoFishController extends Activity
{
	
	private GoFishModel myFish;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myFish = new GoFishModel();
		
		
		
		Start();
		
		
	}

	private void Start()
	{
		if(checkExists(0, 0))
		{
			myFish.moveCards(5, 5, 5);
		}

	}
	
	private boolean checkExists(int cardSlot, int From)
	{
		return false;
		
	}
	
}
