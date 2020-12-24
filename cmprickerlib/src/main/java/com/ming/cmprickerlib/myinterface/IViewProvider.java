package com.ming.cmprickerlib.myinterface;

import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * 作者：NB的LittleWhite
 * <p>  用于提供自定义的item视图
 * 邮箱：zhan_0313@163.com
 */
public interface IViewProvider<T> {
    @LayoutRes
    int resLayout();//获取布局文件,类似于R.layout.xxx
    //对应于adapter中的onBindView
    void onBindView(@NonNull View view, @Nullable T itemData);
    //当ScrollPickerView滚动的时候通知视图进行更新
    void updateView(@NonNull View itemView, boolean isSelected);
}
