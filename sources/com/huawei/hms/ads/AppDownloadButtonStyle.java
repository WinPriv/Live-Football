package com.huawei.hms.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.nativead.R;
import java.util.Locale;

@GlobalApi
/* loaded from: classes2.dex */
public class AppDownloadButtonStyle {

    @GlobalApi
    protected Style normalStyle = new Style();

    @GlobalApi
    protected Style processingStyle = new Style();

    @GlobalApi
    protected Style installingStyle = new Style();

    /* renamed from: com.huawei.hms.ads.AppDownloadButtonStyle$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[AppDownloadStatus.values().length];
            Code = iArr;
            try {
                iArr[AppDownloadStatus.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[AppDownloadStatus.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[AppDownloadStatus.INSTALLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Code[AppDownloadStatus.INSTALLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Code[AppDownloadStatus.DOWNLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Code[AppDownloadStatus.INSTALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @GlobalApi
    /* loaded from: classes2.dex */
    public static class Style {

        @GlobalApi
        protected Drawable background;

        @GlobalApi
        protected int textColor;

        @GlobalApi
        protected int textSize = 12;

        @GlobalApi
        protected Typeface tf;

        @GlobalApi
        public Drawable getBackground() {
            return this.background;
        }

        @GlobalApi
        public int getTextColor() {
            return this.textColor;
        }

        @GlobalApi
        public int getTextSize() {
            return this.textSize;
        }

        @GlobalApi
        public Typeface getTypeface() {
            return this.tf;
        }

        @GlobalApi
        public void setBackground(Drawable drawable) {
            this.background = drawable;
        }

        @GlobalApi
        public void setTextColor(int i10) {
            this.textColor = i10;
        }

        @GlobalApi
        public void setTextSize(int i10) {
            this.textSize = i10;
        }

        @GlobalApi
        public void setTypeface(Typeface typeface) {
            this.tf = typeface;
        }
    }

    @GlobalApi
    public AppDownloadButtonStyle(Context context) {
        this.normalStyle.background = context.getResources().getDrawable(R.drawable.hiad_app_down_btn_normal);
        this.normalStyle.textColor = context.getResources().getColor(R.color.hiad_down_normal_text);
        this.processingStyle.setBackground(Code(context, R.drawable.hiad_app_down_btn_processing));
        this.processingStyle.setTextColor(context.getResources().getColor(R.color.hiad_app_down_processing_text));
        this.installingStyle.setBackground(context.getResources().getDrawable(R.drawable.hiad_app_down_btn_installing));
        this.installingStyle.setTextColor(context.getResources().getColor(R.color.hiad_app_down_installing_text));
    }

    public Drawable Code(Context context, int i10) {
        Drawable drawable = context.getResources().getDrawable(i10);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            drawable.setLayoutDirection(1);
        }
        return drawable;
    }

    @GlobalApi
    public Style getStyle(Context context, AppDownloadStatus appDownloadStatus) {
        int i10 = AnonymousClass1.Code[appDownloadStatus.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return Code();
            }
            return this.installingStyle;
        }
        return this.processingStyle;
    }

    public Style Code() {
        return this.normalStyle;
    }
}
