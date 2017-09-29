package com.example.ksugawara.gamenseni

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by k.sugawara on 2017/09/29.
 */
//ぶっちゃけよくわかんないけど便利になるやつ
fun <T : View> View.bindView(@IdRes id : Int): Lazy<T> = lazy {
    findViewById(id) as T
}