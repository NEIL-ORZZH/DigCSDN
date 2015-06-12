package com.bob.xtb.util;

import android.util.Log;

public class LogUtil {//只打印LEVEL级别以上的日志
	public static final int VERBOSE= 1;
	public static final int DEBUG= 1;
	public static final int INFO= 1;
	public static final int WARN= 1;
	public static final int ERROR= 1;
	public static final int NOTHING= 1;
	public static final int LEVEL= VERBOSE;
	
	public static void v(String tag,String msg)
	{
		if (LEVEL<= VERBOSE) {
			Log.v(tag, msg);			
		}
	}
	public static void d(String tag,String msg)
	{
		if (LEVEL<= DEBUG) {
			Log.d(tag, msg);			
		}
	}
	public static void i(String tag,String msg)
	{
		if (LEVEL<= INFO) {
			Log.i(tag, msg);			
		}
	}
	public static void w(String tag,String msg)
	{
		if (LEVEL<= WARN) {
			Log.w(tag, msg);			
		}
	}
	public static void e(String tag,String msg)
	{
		if (LEVEL<= ERROR) {
			Log.e(tag, msg);			
		}
	}
}
