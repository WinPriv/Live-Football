package com.huawei.hms.ads.template.downloadbuttonstyle;

import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.annotations.DataKeep;
import com.huawei.openalliance.ad.constant.w;

@DataKeep
/* loaded from: classes2.dex */
public class RemoteButtonStyleAttr {
    protected Drawable cancelBtn;
    protected Drawable cancelBtnDark;
    protected Drawable installingBackground;
    protected Drawable installingBackgroundDark;
    protected int installingTextColor;
    protected int installingTextColorDark;
    private int mMaxWidth;
    private int mMinWidth;
    protected Drawable normalBackground;
    protected Drawable normalBackgroundDark;
    protected int normalTextColor;
    protected int normalTextColorDark;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    protected Drawable processingBackground;
    protected Drawable processingBackgroundDark;
    protected int processingTextColor;
    protected int processingTextColorDark;
    private boolean mFixedWidth = false;
    private boolean resetWidth = true;
    private int mTextColor = -1;
    private float mTextSize = 12.0f;
    String mFontFamily = w.cU;

    public Drawable B() {
        return this.installingBackground;
    }

    public int C() {
        return this.installingTextColor;
    }

    public Drawable Code() {
        return this.normalBackground;
    }

    public int D() {
        return this.normalTextColorDark;
    }

    public Drawable F() {
        return this.normalBackgroundDark;
    }

    public Drawable I() {
        return this.processingBackground;
    }

    public Drawable L() {
        return this.processingBackgroundDark;
    }

    public Drawable S() {
        return this.cancelBtn;
    }

    public int V() {
        return this.normalTextColor;
    }

    public int Z() {
        return this.processingTextColor;
    }

    public int a() {
        return this.processingTextColorDark;
    }

    public Drawable b() {
        return this.installingBackgroundDark;
    }

    public int c() {
        return this.installingTextColorDark;
    }

    public Drawable d() {
        return this.cancelBtnDark;
    }

    public boolean e() {
        return this.mFixedWidth;
    }

    public boolean f() {
        return this.resetWidth;
    }

    public int g() {
        return this.mMaxWidth;
    }

    public int h() {
        return this.mMinWidth;
    }

    public float j() {
        return this.mTextSize;
    }

    public String k() {
        return this.mFontFamily;
    }

    public int l() {
        return this.paddingLeft;
    }

    public int m() {
        return this.paddingRight;
    }

    public int n() {
        return this.paddingTop;
    }

    public int o() {
        return this.paddingBottom;
    }

    public void B(Drawable drawable) {
        this.normalBackgroundDark = drawable;
    }

    public void C(Drawable drawable) {
        this.processingBackgroundDark = drawable;
    }

    public void Code(Drawable drawable) {
        this.normalBackground = drawable;
    }

    public void F(Drawable drawable) {
        this.cancelBtnDark = drawable;
    }

    public void I(Drawable drawable) {
        this.installingBackground = drawable;
    }

    public void S(Drawable drawable) {
        this.installingBackgroundDark = drawable;
    }

    public void V(Drawable drawable) {
        this.processingBackground = drawable;
    }

    public void Z(Drawable drawable) {
        this.cancelBtn = drawable;
    }
}
