package com.zry.file;

import java.io.IOException;
import java.io.ObjectOutputStream;

import android.util.Log;

public class MyUtils {
	public static void close(ObjectOutputStream objectOutputStream){
		try {
			objectOutputStream.close();
		} catch (IOException e) {
			Log.d("ryzh", "ObjectOutputStream关闭失败");
			e.printStackTrace();
		}
	}
}
