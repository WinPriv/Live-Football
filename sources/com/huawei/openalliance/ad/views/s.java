package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.hms.ads.nativead.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public class s {
    protected Drawable B;
    protected b I;
    protected b V;
    protected b Z;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24155a;

        static {
            int[] iArr = new int[da.n.values().length];
            f24155a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24155a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24155a[8] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24155a[10] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24155a[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24155a[9] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f24156a;

        /* renamed from: b, reason: collision with root package name */
        public int f24157b;
    }

    public s(Context context) {
        b bVar = new b();
        this.V = bVar;
        this.I = new b();
        this.Z = new b();
        bVar.f24156a = context.getResources().getDrawable(R.drawable.hiad_app_down_btn_normal);
        this.V.f24157b = context.getResources().getColor(R.color.hiad_down_normal_text);
        this.I.f24156a = Code(context, R.drawable.hiad_app_down_btn_processing);
        this.I.f24157b = context.getResources().getColor(R.color.hiad_app_down_processing_text);
        this.Z.f24156a = context.getResources().getDrawable(R.drawable.hiad_app_down_btn_installing);
        this.Z.f24157b = context.getResources().getColor(R.color.hiad_app_down_installing_text);
        this.B = context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn);
    }

    public Drawable Code(Context context, int i10) {
        Drawable drawable = context.getResources().getDrawable(i10);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            drawable.setLayoutDirection(1);
        }
        return drawable;
    }

    public b Code() {
        return this.V;
    }

    public b Code(Context context, da.n nVar) {
        int i10 = a.f24155a[nVar.ordinal()];
        return (i10 == 1 || i10 == 2) ? this.I : i10 != 3 ? Code() : this.Z;
    }
}
