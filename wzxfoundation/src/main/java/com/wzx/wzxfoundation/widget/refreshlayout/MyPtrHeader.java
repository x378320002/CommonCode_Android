package com.wzx.wzxfoundation.widget.refreshlayout;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.wzx.wzxfoundation.R;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrUIHandler;
import in.srain.cube.views.ptr.indicator.PtrIndicator;

/**
 * Created by wangzixu on 2017/9/1.
 */
public class MyPtrHeader extends FrameLayout implements PtrUIHandler {
    public MyPtrHeader(@NonNull Context context) {
        this(context, null);
    }

    public MyPtrHeader(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyPtrHeader(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initViews();
    }

    private void initViews() {
        LayoutInflater.from(getContext()).inflate(R.layout.wzx_ptrheader, this);
    }

    //1
    @Override
    public void onUIRefreshPrepare(PtrFrameLayout frame) {
    }

    //2
    @Override
    public void onUIRefreshBegin(PtrFrameLayout frame) {
    }

    //3
    @Override
    public void onUIRefreshComplete(PtrFrameLayout frame) {
    }

    //4
    @Override
    public void onUIReset(PtrFrameLayout frame) {
    }

    @Override
    public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator) {
//        final int mOffsetToRefresh = ptrIndicator.getOffsetToRefresh();
//        final int currentPos = ptrIndicator.getCurrentPosY();
//        final int lastPos = ptrIndicator.getLastPosY();
//
//
//        if (currentPos < mOffsetToRefresh && lastPos >= mOffsetToRefresh) {
//            if (isUnderTouch && status == PtrFrameLayout.PTR_STATUS_PREPARE) {
//                mTvTitle.setText("下拉刷新");
//                if (mIvArrow != null) {
//                    mIvArrow.clearAnimation();
//                    mIvArrow.startAnimation(mReverseFlipAnimation);
//                }
//            }
//        } else if (currentPos > mOffsetToRefresh && lastPos <= mOffsetToRefresh) {
//            if (isUnderTouch && status == PtrFrameLayout.PTR_STATUS_PREPARE) {
//                mTvTitle.setText("释放刷新");
//                if (mIvArrow != null) {
//                    mIvArrow.clearAnimation();
//                    mIvArrow.startAnimation(mFlipAnimation);
//                }
//            }
//        }
    }
}
