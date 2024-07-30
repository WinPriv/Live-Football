package com.huawei.openalliance.ad.ppskit.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.activity.LandingDetailsActivity;
import com.huawei.openalliance.ad.ppskit.activity.SafeIntent;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import java.util.ArrayList;
import java.util.Locale;
import ka.n7;

/* loaded from: classes2.dex */
public class SixElementsView extends LinearLayout implements View.OnClickListener {
    public static final /* synthetic */ int J = 0;
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public ContentRecord H;
    public AppInfo I;

    /* renamed from: s, reason: collision with root package name */
    public int f23337s;

    /* renamed from: t, reason: collision with root package name */
    public int f23338t;

    /* renamed from: u, reason: collision with root package name */
    public float f23339u;

    /* renamed from: v, reason: collision with root package name */
    public Context f23340v;

    /* renamed from: w, reason: collision with root package name */
    public View f23341w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f23342x;
    public TextView y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f23343z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f23345s;

        public a(View view) {
            this.f23345s = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int width = this.f23345s.getWidth();
            if (width == 0) {
                n7.e("SixElementsView", "do not get screen width.");
                return;
            }
            double d10 = width;
            int i10 = (int) (0.35d * d10);
            n7.f("SixElementsView", "larger detail width is %d", Integer.valueOf(i10));
            int i11 = (int) (d10 * 0.18d);
            n7.f("SixElementsView", "small detail width is %d", Integer.valueOf(i11));
            SixElementsView sixElementsView = SixElementsView.this;
            sixElementsView.f23343z.setMaxWidth(i10);
            sixElementsView.A.setMaxWidth(i11);
            sixElementsView.B.setMaxWidth(i11);
            sixElementsView.C.setMaxWidth(i11);
            String lowerCase = z1.C(sixElementsView.f23340v).toLowerCase(Locale.getDefault());
            n7.c("SixElementsView", " languageCode=%s", lowerCase);
            if ("bo-cn".equals(lowerCase)) {
                sixElementsView.f23343z.setIncludeFontPadding(true);
                sixElementsView.A.setIncludeFontPadding(true);
                sixElementsView.B.setIncludeFontPadding(true);
                sixElementsView.C.setIncludeFontPadding(true);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23347a;

        static {
            int[] iArr = new int[s.f.d(3).length];
            f23347a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23347a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23347a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SixElementsView(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.SixElementsView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void setTextMaxWidth(View view) {
        if (view == null) {
            n7.e("SixElementsView", "rootView is null..");
        } else {
            view.postDelayed(new a(view), 200L);
        }
    }

    public final void a(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, this.f23340v.getResources().getDimensionPixelSize(R.dimen.hiad_10_dp));
    }

    public final void b(ContentRecord contentRecord) {
        String appDesc;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        int i12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        boolean z15;
        String str;
        if (contentRecord == null) {
            str = "landingPageData is null.";
        } else {
            this.H = contentRecord;
            AppInfo j02 = contentRecord.j0();
            this.I = j02;
            if (j02 == null) {
                str = "appInfo is null.";
            } else {
                TextView textView = this.f23342x;
                if (!TextUtils.isEmpty(j02.getAppName())) {
                    appDesc = this.I.getAppName();
                } else {
                    appDesc = this.I.getAppDesc();
                }
                textView.setText(appDesc);
                this.y.setText(this.I.getDeveloperName());
                int i15 = 0;
                boolean z16 = true;
                if (h()) {
                    String string = this.f23340v.getResources().getString(R.string.hiad_app_detail_version, this.I.getVersionName());
                    String string2 = this.f23340v.getResources().getString(R.string.hiad_introductory);
                    String string3 = this.f23340v.getResources().getString(R.string.hiad_privacy_policy);
                    String string4 = this.f23340v.getResources().getString(R.string.hiad_app_permission);
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(this.I.getVersionName())) {
                        sb2.append(string);
                    }
                    AppInfo appInfo = this.I;
                    if (appInfo != null && !TextUtils.isEmpty(appInfo.A())) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        sb2.append("｜");
                        sb2.append(string2);
                    }
                    boolean i16 = i();
                    if (i16) {
                        sb2.append("｜");
                        sb2.append(string3);
                    }
                    AppInfo appInfo2 = this.I;
                    if (appInfo2 != null && (!TextUtils.isEmpty(appInfo2.N()) || this.I.d0())) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        sb2.append("｜");
                        sb2.append(string4);
                    }
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    if (z14) {
                        d(spannableString, sb2.toString(), string2, 1);
                    }
                    if (i16) {
                        d(spannableString, sb2.toString(), string3, 2);
                    }
                    if (z15) {
                        d(spannableString, sb2.toString(), string4, 3);
                    }
                    String sb3 = sb2.toString();
                    ArrayList arrayList = new ArrayList();
                    for (int i17 = 0; i17 < sb3.length(); i17++) {
                        if (sb3.charAt(i17) == 65372) {
                            arrayList.add(Integer.valueOf(i17));
                        }
                    }
                    while (i15 < arrayList.size()) {
                        spannableString.setSpan(new AbsoluteSizeSpan(this.f23340v.getResources().getDimensionPixelSize(R.dimen.hiad_text_10_sp)) { // from class: com.huawei.openalliance.ad.ppskit.views.SixElementsView.2
                            @Override // android.text.style.AbsoluteSizeSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                super.updateDrawState(textPaint);
                                textPaint.setColor(SixElementsView.this.f23340v.getResources().getColor(R.color.hiad_20_percent_black));
                                textPaint.setUnderlineText(false);
                            }
                        }, ((Integer) arrayList.get(i15)).intValue(), ((Integer) arrayList.get(i15)).intValue() + 1, 33);
                        i15++;
                    }
                    this.G.setText(spannableString);
                    this.G.setMovementMethod(LinkMovementMethod.getInstance());
                    this.G.setHighlightColor(this.f23340v.getResources().getColor(R.color.hiad_transparent));
                    return;
                }
                if (TextUtils.isEmpty(this.I.getVersionName())) {
                    this.f23343z.setVisibility(8);
                } else {
                    this.f23343z.setVisibility(0);
                    this.f23343z.setText(this.f23340v.getResources().getString(R.string.hiad_app_detail_version, this.I.getVersionName()));
                }
                if (this.f23343z.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AppInfo appInfo3 = this.I;
                if (appInfo3 != null && !TextUtils.isEmpty(appInfo3.A())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TextView textView2 = this.A;
                if (z11) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView2.setVisibility(i10);
                TextView textView3 = this.D;
                if (z11 & z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView3.setVisibility(i11);
                if (!z11 && !z10) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                boolean i18 = i();
                TextView textView4 = this.B;
                if (i18) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                textView4.setVisibility(i12);
                TextView textView5 = this.E;
                if (i18 & z12) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                textView5.setVisibility(i13);
                if (!i18 && !z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AppInfo appInfo4 = this.I;
                if (appInfo4 == null || (TextUtils.isEmpty(appInfo4.N()) && !this.I.d0())) {
                    z16 = false;
                }
                TextView textView6 = this.C;
                if (z16) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                textView6.setVisibility(i14);
                TextView textView7 = this.F;
                if (!(z13 & z16)) {
                    i15 = 8;
                }
                textView7.setVisibility(i15);
                return;
            }
        }
        n7.g("SixElementsView", str);
    }

    public final void c() {
        if (h()) {
            return;
        }
        setTextMaxWidth(this.f23341w);
    }

    public final void d(SpannableString spannableString, String str, String str2, int i10) {
        b1 b1Var = new b1(this, i10);
        int indexOf = str.indexOf(str2);
        spannableString.setSpan(b1Var, indexOf, str2.length() + indexOf, 33);
    }

    public final void e() {
        if (TextUtils.isEmpty(this.I.M())) {
            n7.g("SixElementsView", "privacyUrl is empty.");
        } else {
            com.huawei.openalliance.ad.ppskit.utils.d0.h(this.f23340v, this.I.M());
        }
    }

    public final void f() {
        if (!TextUtils.isEmpty(this.I.N())) {
            com.huawei.openalliance.ad.ppskit.utils.d0.h(this.f23340v, this.I.N());
        } else {
            ra.k.a(this.f23340v, this.I, null);
        }
    }

    public final void g() {
        ContentRecord contentRecord = this.H;
        if (contentRecord != null && contentRecord.j0() != null && !TextUtils.isEmpty(this.H.j0().A())) {
            Context context = this.f23340v;
            ContentRecord contentRecord2 = this.H;
            int i10 = LandingDetailsActivity.C;
            if (contentRecord2 != null) {
                n7.e("LandingDetailActivity", "start landing detail activity start.");
                SafeIntent safeIntent = new SafeIntent(new Intent(context, (Class<?>) LandingDetailsActivity.class));
                safeIntent.putExtra("content_id", contentRecord2.h());
                safeIntent.putExtra(ba.f22057e, contentRecord2.j2());
                safeIntent.putExtra("unique_id", contentRecord2.x0());
                safeIntent.putExtra("slotid", contentRecord2.p2());
                safeIntent.putExtra("request_id", contentRecord2.o1());
                safeIntent.putExtra("apiVer", contentRecord2.a1());
                safeIntent.putExtra(ba.y, contentRecord2.h1());
                safeIntent.putExtra("templateId", contentRecord2.Z0());
                try {
                    safeIntent.setFlags(com.anythink.expressad.exoplayer.b.aX);
                    if (!(context instanceof Activity)) {
                        safeIntent.addFlags(268435456);
                    }
                    z1.r(context, safeIntent);
                    return;
                } catch (Throwable th) {
                    n7.j("LandingDetailActivity", "start landing detail Activity error: %s", th.getClass().getSimpleName());
                    return;
                }
            }
            return;
        }
        n7.e("SixElementsView", "start landing detail activity landingPageData detail url is empty.");
    }

    public final boolean h() {
        if (this.f23337s == 0 && com.huawei.openalliance.ad.ppskit.utils.d0.v(this.f23340v)) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        AppInfo appInfo;
        ContentRecord contentRecord = this.H;
        if (contentRecord == null || !contentRecord.l1() || (appInfo = this.I) == null || TextUtils.isEmpty(appInfo.getPackageName()) || TextUtils.isEmpty(this.I.M())) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.six_elements_privacy_policy) {
            e();
        } else if (id2 == R.id.six_elements_permission) {
            f();
        } else if (id2 == R.id.six_elements_desc) {
            g();
        }
    }

    public void setTitleTextVisibility(int i10) {
        this.f23342x.setVisibility(i10);
    }
}
