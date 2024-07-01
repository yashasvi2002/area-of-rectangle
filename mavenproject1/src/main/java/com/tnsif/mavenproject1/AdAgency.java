package com.tnsif.mavenproject1;

public abstract class AdAgency implements Advertise {
	//ImgAd obj=new ImgAd();
	//VideoAd obj=new VideoAd();
	//Advertise obj=new ImgAd();
	Advertise obj; //loose coupling

	
	void publishAd()
	{
		obj.getAdDetails();
	}


	
}
