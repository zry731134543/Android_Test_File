package com.zry.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Window;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
	}
	private void persistToFile(){
		//手机内存的官方路径
		String path=Environment.getExternalStorageDirectory().getAbsolutePath();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				User user=new User(1, "user", false);
				File dir =new File(MyConstanst.CACHE_FILE2_PATH);
				if(!dir.exists()){
					dir.mkdir();
				}
				File cachedFile =new File(MyConstanst.CACHE_FILE_PATH);
				ObjectOutputStream objectOutputStream=null;
				try {
					objectOutputStream =new ObjectOutputStream(new FileOutputStream(cachedFile));
					objectOutputStream.writeObject(user);
					Log.d("ryzh", "user:"+user);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					MyUtils.close(objectOutputStream);
				}
			}
		}).start();
	}
	
}
