package com.huawei.openalliance.ad.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import ba.b;
import com.huawei.hms.ads.AdFeedbackListener;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.dh;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.jh;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.feedback.FeedbackView;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.inter.data.j;
import com.huawei.openalliance.ad.utils.SafeIntent;
import gb.u;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import x9.d;

@AllApi
/* loaded from: classes2.dex */
public class FeedbackActivity extends a implements b {
    public static WeakReference<Context> O;
    public int L;
    public static final HashMap M = new HashMap();
    public static final HashMap N = new HashMap();
    public static final SecureRandom P = new SecureRandom();

    @Override // com.huawei.openalliance.ad.activity.a
    public final boolean a() {
        SafeIntent safeIntent = new SafeIntent(getIntent());
        j Code = dh.Code();
        this.L = safeIntent.getIntExtra("instanceId", 0);
        if (Code == null) {
            return false;
        }
        this.y = Code.m();
        return super.a();
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public final void c() {
        this.F = (RelativeLayout) findViewById(R.id.feedback_activity_root);
        this.G = findViewById(R.id.margin_view);
        this.H = findViewById(R.id.feedback_anchor_view);
        this.f21954z = (FeedbackView) findViewById(R.id.top_feedback_view);
        this.C = (ImageView) findViewById(R.id.top_feedback_iv);
        this.A = (FeedbackView) findViewById(R.id.bottom_feedback_view);
        this.D = (ImageView) findViewById(R.id.bottom_feedback_iv);
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public final void f() {
        b();
        this.B.d(this.f21952w, this.f21953x);
        this.B.setAdContentData(this.y);
        this.B.setFeedbackListener(this);
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public final int i() {
        return R.layout.hiad_activity_feedback;
    }

    @Override // com.huawei.openalliance.ad.activity.a
    public final void j() {
        AdFeedbackListener adFeedbackListener = (AdFeedbackListener) N.get(Integer.valueOf(this.L));
        if (adFeedbackListener != null) {
            adFeedbackListener.onAdFeedbackShowFailed();
        }
    }

    public final void m(int i10, FeedbackInfo feedbackInfo) {
        ArrayList arrayList;
        ex.V("FeedbackActivity", "action type: %s", Integer.valueOf(i10));
        try {
            arrayList = new ArrayList();
            arrayList.add(feedbackInfo);
        } catch (Throwable th) {
            ex.I("FeedbackActivity", "itemClickAction error: %s", th.getClass().getSimpleName());
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    ex.Code("FeedbackActivity", "invalid feedback type");
                }
            } else {
                o(arrayList);
            }
            finish();
        }
        n(i10, arrayList);
        finish();
    }

    public final void n(int i10, ArrayList arrayList) {
        String str;
        boolean z10;
        boolean z11 = false;
        Toast.makeText(getApplicationContext(), R.string.hiad_feedback_reduce_such_content, 0).show();
        jh.Code(this, this.y, arrayList, 1);
        if (1 == i10) {
            str = "2";
        } else {
            str = "4";
        }
        cz.Code(this, this.y, str);
        AdFeedbackListener adFeedbackListener = (AdFeedbackListener) M.get(Integer.valueOf(this.L));
        AdFeedbackListener adFeedbackListener2 = (AdFeedbackListener) N.get(Integer.valueOf(this.L));
        Object[] objArr = new Object[2];
        if (adFeedbackListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        objArr[0] = Boolean.valueOf(z10);
        if (adFeedbackListener2 != null) {
            z11 = true;
        }
        objArr[1] = Boolean.valueOf(z11);
        ex.V("FeedbackActivity", "neg, innerListener: %s, listener: %s", objArr);
        if (adFeedbackListener != null) {
            adFeedbackListener.onAdDisliked();
        }
        if (adFeedbackListener2 != null) {
            adFeedbackListener2.onAdDisliked();
        }
    }

    public final void o(ArrayList arrayList) {
        boolean z10;
        boolean z11 = false;
        Toast.makeText(getApplicationContext(), R.string.hiad_feedback_had_feedback, 0).show();
        jh.Code(this, this.y, arrayList, 2);
        cz.Code(this, this.y, "1");
        AdFeedbackListener adFeedbackListener = (AdFeedbackListener) M.get(Integer.valueOf(this.L));
        AdFeedbackListener adFeedbackListener2 = (AdFeedbackListener) N.get(Integer.valueOf(this.L));
        Object[] objArr = new Object[2];
        if (adFeedbackListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        objArr[0] = Boolean.valueOf(z10);
        if (adFeedbackListener2 != null) {
            z11 = true;
        }
        objArr[1] = Boolean.valueOf(z11);
        ex.V("FeedbackActivity", "pos, innerListener: %s, listener: %s", objArr);
        if (adFeedbackListener != null) {
            adFeedbackListener.onAdLiked();
        }
        if (adFeedbackListener2 != null) {
            adFeedbackListener2.onAdLiked();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            this.F.setOnClickListener(new d(this));
            cz.Code(this, this.y, "0");
            u.e(this, O.get());
            ex.V("FeedbackActivity", "onCreate: %s, instance: %s", Integer.valueOf(hashCode()), Integer.valueOf(this.L));
        } catch (Throwable th) {
            ex.I("FeedbackActivity", "onCreate error: %s", th.getClass().getSimpleName());
            AdFeedbackListener adFeedbackListener = (AdFeedbackListener) N.get(Integer.valueOf(this.L));
            if (adFeedbackListener != null) {
                adFeedbackListener.onAdFeedbackShowFailed();
            }
            finish();
        }
    }

    @Override // com.huawei.openalliance.ad.activity.a, com.huawei.openalliance.ad.activity.c, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dh.Code(null);
        ex.V("FeedbackActivity", "onDestroy %s, instance: %s", Integer.valueOf(hashCode()), Integer.valueOf(this.L));
        int i10 = this.L;
        M.remove(Integer.valueOf(i10));
        N.remove(Integer.valueOf(i10));
    }
}
