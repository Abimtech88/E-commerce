package org.test;

import java.io.IOException;

public class Ecommerce {
public static void main(String[] args) throws IOException, InterruptedException {
	
	HelperClass h = new HelperClass();
	h.getDriver();
	h.loadUrl("https://www.nykaa.com/offers.html?gclid=Cj0KCQjwncT1BRDhARIsAOQF9LngsJE0gviBl9QUgTTgxa4PXC2_uWEiRiJks7dWLGKn2X6uVKEAMVIaAnlCEALw_wcB&root=nav_1&ef_id=Cj0KCQjwncT1BRDhARIsAOQF9LngsJE0gviBl9QUgTTgxa4PXC2_uWEiRiJks7dWLGKn2X6uVKEAMVIaAnlCEALw_wcB:G:s&s_kwcid=AL!599!3!284896751252!e!!g!!nykaa&utm_source=GooglePaid&utm_medium=Search&utm_campaign=Search_Nykaa");
	h.winmax();
	PomClass p = new PomClass();
	h.mouseOverAction(p.getFash());
	h.mouseOverAction(p.getFashion());
	h.mouseOverAction(p.getSarees());
	h.clickBtn(p.getSarees());
	h.getUrl();
	h.screenShot("Saree.bmp");
	h.parId();
	h.clickBtn(p.getBrand());
	h.parId();
	h.clickBtn(p.getSize());
	h.clickBtn(p.getBag());
	h.screenShot("Brand.bmp");
	h.pageDown(p.getDown());
	h.clickBtn(p.getDown());
	}
}
