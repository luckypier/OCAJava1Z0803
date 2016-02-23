package com.zyx.ocaexamples.chapter02.flow;

import java.util.ArrayList;

public class StripedBass {
	public static void main(String[] args) {
		System.out.println("inicio");

		// ArrayList<float> fishLengthList = new ArrayList<float>();
		ArrayList<Float> fishLengthList = new ArrayList<Float>();

		fishLengthList.add(10.0f);
		fishLengthList.add(15.5f);
		fishLengthList.add(18.0f);
		fishLengthList.add(29.5f);
		fishLengthList.add(49.5f);

		for (float fishlengthlist : fishLengthList) {
			if (fishlengthlist > 28.0f)
				System.out.print(fishlengthlist);
		}
	}
}