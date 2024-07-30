package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import java.util.Locale;

/* loaded from: classes2.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final b f23403a;

    /* renamed from: b, reason: collision with root package name */
    public final b f23404b;

    /* renamed from: c, reason: collision with root package name */
    public final b f23405c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f23406d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f23407e;
    public final b f;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23408a;

        static {
            int[] iArr = new int[AppStatus.values().length];
            f23408a = iArr;
            try {
                iArr[AppStatus.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23408a[AppStatus.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23408a[AppStatus.INSTALLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23408a[AppStatus.INSTALLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23408a[AppStatus.DOWNLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23408a[AppStatus.INSTALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f23409a;

        /* renamed from: b, reason: collision with root package name */
        public int f23410b;
    }

    public c1(Context context) {
        b bVar = new b();
        this.f23403a = bVar;
        b bVar2 = new b();
        this.f23404b = bVar2;
        b bVar3 = new b();
        this.f23405c = bVar3;
        b bVar4 = new b();
        this.f = bVar4;
        this.f23407e = context;
        bVar.f23409a = context.getResources().getDrawable(R.drawable.hiad_app_down_btn_normal);
        bVar.f23410b = context.getResources().getColor(R.color.hiad_down_normal_text);
        bVar2.f23409a = a(R.drawable.hiad_app_down_btn_processing, context);
        bVar2.f23410b = context.getResources().getColor(R.color.hiad_app_down_processing_text);
        bVar4.f23409a = context.getResources().getDrawable(R.drawable.hiad_app_down_btn_installing);
        bVar4.f23410b = context.getResources().getColor(R.color.hiad_app_down_installing_text);
        bVar3.f23409a = context.getResources().getDrawable(R.drawable.hiad_linked_app_down_btn_installing);
        bVar3.f23410b = context.getResources().getColor(R.color.hiad_emui_white);
        this.f23406d = context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn);
    }

    public static Drawable a(int i10, Context context) {
        Drawable drawable = context.getResources().getDrawable(i10);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            drawable.setLayoutDirection(1);
        }
        return drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.views.c1.b b(int r6, com.huawei.openalliance.ad.ppskit.download.app.AppStatus r7) {
        /*
            r5 = this;
            com.huawei.openalliance.ad.ppskit.views.c1$b r0 = r5.f23403a
            if (r7 != 0) goto L5
            return r0
        L5:
            r1 = 11
            r2 = 3
            r3 = 2
            r4 = 1
            if (r6 != r1) goto L20
            int[] r6 = com.huawei.openalliance.ad.ppskit.views.c1.a.f23408a
            int r1 = r7.ordinal()
            r6 = r6[r1]
            if (r6 == r4) goto L1e
            if (r6 == r3) goto L1e
            if (r6 == r2) goto L1b
            goto L20
        L1b:
            com.huawei.openalliance.ad.ppskit.views.c1$b r6 = r5.f23405c
            goto L21
        L1e:
            r6 = r0
            goto L21
        L20:
            r6 = 0
        L21:
            if (r6 != 0) goto L38
            int[] r6 = com.huawei.openalliance.ad.ppskit.views.c1.a.f23408a
            int r7 = r7.ordinal()
            r6 = r6[r7]
            if (r6 == r4) goto L35
            if (r6 == r3) goto L35
            if (r6 == r2) goto L32
            goto L37
        L32:
            com.huawei.openalliance.ad.ppskit.views.c1$b r0 = r5.f
            goto L37
        L35:
            com.huawei.openalliance.ad.ppskit.views.c1$b r0 = r5.f23404b
        L37:
            r6 = r0
        L38:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.c1.b(int, com.huawei.openalliance.ad.ppskit.download.app.AppStatus):com.huawei.openalliance.ad.ppskit.views.c1$b");
    }
}
