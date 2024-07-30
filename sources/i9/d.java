package i9;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.nativead.api.ATNativeImageView;
import com.anythink.nativead.api.ATNativeMaterial;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import java.util.ArrayList;
import m9.j;

/* compiled from: SelfRenderViewUtil.java */
/* loaded from: classes2.dex */
public final class d {
    public static void a(Activity activity, ATNativeMaterial aTNativeMaterial, j jVar, ATNativePrepareInfo aTNativePrepareInfo) {
        int b10 = b(activity, 5.0f);
        jVar.f33019a.setPadding(b10, b10, b10, b10);
        if (aTNativePrepareInfo == null) {
            aTNativePrepareInfo = new ATNativePrepareInfo();
        }
        ArrayList arrayList = new ArrayList();
        String title = aTNativeMaterial.getTitle();
        boolean isEmpty = TextUtils.isEmpty(title);
        TextView textView = jVar.f33024g;
        if (!isEmpty) {
            textView.setText(title);
            aTNativePrepareInfo.setTitleView(textView);
            arrayList.add(textView);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        String descriptionText = aTNativeMaterial.getDescriptionText();
        boolean isEmpty2 = TextUtils.isEmpty(descriptionText);
        TextView textView2 = jVar.f33020b;
        if (!isEmpty2) {
            textView2.setText(descriptionText);
            aTNativePrepareInfo.setDescView(textView2);
            arrayList.add(textView2);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        View adIconView = aTNativeMaterial.getAdIconView();
        String iconImageUrl = aTNativeMaterial.getIconImageUrl();
        FrameLayout frameLayout = jVar.f33022d;
        frameLayout.removeAllViews();
        ATNativeImageView aTNativeImageView = new ATNativeImageView(activity);
        if (adIconView != null) {
            frameLayout.addView(adIconView);
            aTNativePrepareInfo.setIconView(adIconView);
            arrayList.add(adIconView);
            frameLayout.setVisibility(0);
        } else if (!TextUtils.isEmpty(iconImageUrl)) {
            frameLayout.addView(aTNativeImageView);
            aTNativeImageView.setImage(iconImageUrl);
            aTNativePrepareInfo.setIconView(aTNativeImageView);
            arrayList.add(aTNativeImageView);
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(4);
        }
        String callToActionText = aTNativeMaterial.getCallToActionText();
        boolean isEmpty3 = TextUtils.isEmpty(callToActionText);
        TextView textView3 = jVar.f33023e;
        if (!isEmpty3) {
            textView3.setText(callToActionText);
            aTNativePrepareInfo.setCtaView(textView3);
            arrayList.add(textView3);
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        int mainImageHeight = aTNativeMaterial.getMainImageHeight();
        int mainImageWidth = aTNativeMaterial.getMainImageWidth();
        int b11 = activity.getResources().getDisplayMetrics().widthPixels - b(activity, 10.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (mainImageWidth > 0 && mainImageHeight > 0) {
            layoutParams.width = b11;
            layoutParams.height = (mainImageHeight * b11) / mainImageWidth;
        } else {
            layoutParams.width = -1;
            layoutParams.height = (b11 * 600) / 1024;
        }
        String adChoiceIconUrl = aTNativeMaterial.getAdChoiceIconUrl();
        Bitmap adLogo = aTNativeMaterial.getAdLogo();
        boolean isEmpty4 = TextUtils.isEmpty(adChoiceIconUrl);
        ATNativeImageView aTNativeImageView2 = jVar.f;
        if (!isEmpty4) {
            aTNativeImageView2.setImage(adChoiceIconUrl);
            aTNativePrepareInfo.setAdLogoView(aTNativeImageView2);
            aTNativeImageView2.setVisibility(0);
        } else if (adLogo != null) {
            aTNativeImageView2.setImageBitmap(adLogo);
            aTNativeImageView2.setVisibility(0);
        } else {
            aTNativeImageView2.setImageBitmap(null);
            aTNativeImageView2.setVisibility(8);
        }
        String adFrom = aTNativeMaterial.getAdFrom();
        boolean isEmpty5 = TextUtils.isEmpty(adFrom);
        TextView textView4 = jVar.f33021c;
        if (!isEmpty5) {
            textView4.setText(adFrom);
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(8);
        }
        aTNativePrepareInfo.setAdFromView(textView4);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(b(activity, 40.0f), b(activity, 10.0f));
        layoutParams2.gravity = 85;
        aTNativePrepareInfo.setChoiceViewLayoutParams(layoutParams2);
        aTNativePrepareInfo.setClickViewList(arrayList);
        if (aTNativePrepareInfo instanceof ATNativePrepareExInfo) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(textView3);
            ((ATNativePrepareExInfo) aTNativePrepareInfo).setCreativeClickViewList(arrayList2);
        }
    }

    public static int b(Activity activity, float f) {
        return (int) ((f * activity.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
