package cn.zmy.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by zmy on 2016/6/21 0021.
 */
public class ScreenUtil
{
    public static int getStatusBarHeight(Context context)
    {
        int result = ScreenUtil.dip2Px(context,24);
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0)
        {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public static int dip2Px(Context context, float dp)
    {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());

    }
}
