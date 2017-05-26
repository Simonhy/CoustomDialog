package com.isoftstone.dialogibrary;

import android.content.Context;

/**
 * Created by yonghuangl on 2017/5/26.
 */
public class UIUtils {
    /**
     * 将dp值转换为px值，保证文字大小不变
     *
     * @param
     * @param
     *            （DisplayMetrics类中属性scaledDensity）
     * @return
     */
    public static int dp2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

}
