package com.yey.kindergaten.activity.classvideo;

import android.content.Context;

public class DisplayUtil {
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}
}
