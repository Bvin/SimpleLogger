package cn.bvin.library.debug;


import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/**
 * 
 * @ClassName: SimpleLogger 
 * @Description:轻量Log，只在DEBUG下有答应，正式发布将不会答应
 * @author: Bvin
 * @date: 2015年3月20日 上午10:15:51
 */
    
public class SimpleLogger {
	
	/*error组*/
	public static void log_e(String msg){
		log_e("tag",msg);
	}
	
	public static void log_e(String tag,int msg){
		if (BuildConfig.DEBUG) {
			if (!TextUtils.isEmpty(tag)) {
				Log.e(tag,String.valueOf(msg));
			}
		}
	}
	
	public static void log_e(String tag,boolean msg){
		if (BuildConfig.DEBUG) {
			if (!TextUtils.isEmpty(tag)) {
				Log.e(tag,String.valueOf(msg));
			}
		}
	}
	
	public static void log_e(String tag,float msg){
		if (BuildConfig.DEBUG) {
			if (!TextUtils.isEmpty(tag)) {
				Log.e(tag, String.valueOf(msg));
			}
		}
	}
	
	
	public static void log_e(String tag,double msg){
		if (BuildConfig.DEBUG) {
			if (!TextUtils.isEmpty(tag)) {
				Log.e(tag, String.valueOf(msg));
			}
		}
	}
	
	public static void log_e(String tag,Object msg){
		if (BuildConfig.DEBUG) {
			if (!TextUtils.isEmpty(tag)) {
				Log.e(tag, msg.toString());
			}
		}
	}
	
	
	
	public static void log_e(String tag,String msg){
		if (BuildConfig.DEBUG) {
			if (!TextUtils.isEmpty(tag)) {
				Log.e(tag, msg);
			}
		}
	}
	
	
	
	/*toast组*/
	public static void showToast(Context ctx,String msg){
		showToast(ctx, msg, 3000);
	}
	
	public static void showToast(Context ctx,String msg,int length){
		if(BuildConfig.DEBUG)
		if(!TextUtils.isEmpty(msg)){
			Toast.makeText(ctx, msg, length).show();
		}
		
	}
	
	/*print组*/
	public static void print(String msg){
		if(BuildConfig.DEBUG)
		if(!TextUtils.isEmpty(msg)){
			System.out.println(msg);
		}
	}
}
