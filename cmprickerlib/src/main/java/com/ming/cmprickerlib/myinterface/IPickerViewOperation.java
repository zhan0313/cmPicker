package com.ming.cmprickerlib.myinterface;

import android.view.View;

/**
 * 作者：NB的LittleWhite
 * <p> 用户甚至可以自定义adapter
 * 邮箱：zhan_0313@163.com
 */
public interface IPickerViewOperation {
    int getSelectedItemOffset();//获取选中item的偏移量

    int getVisibleItemNumber();//获取可见item的数目

    int getLineColor();//获取分割线的颜色

    void updateView(View itemView, boolean isSelected);//滚动的过程中更新视图
}
