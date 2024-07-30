package com.huawei.hms.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.annotation.GlobalApi;
import com.huawei.hms.ads.base.R;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.c0;
import gb.w0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ChoicesView extends ImageView {

    /* renamed from: com.huawei.hms.ads.ChoicesView$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ String Code;

        /* renamed from: com.huawei.hms.ads.ChoicesView$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C02471 implements RemoteCallResultCallback<String> {
            public C02471() {
            }

            @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
            public void onRemoteCallResult(String str, CallResult<String> callResult) {
                String data = callResult.getData();
                SourceParam sourceParam = new SourceParam();
                sourceParam.i(data);
                w0.e(ChoicesView.this.getContext(), sourceParam, new gb.j() { // from class: com.huawei.hms.ads.ChoicesView.1.1.1
                    @Override // gb.j
                    public void Code() {
                        ex.Code("ChoicesView", "download icon fail, use local icon");
                        gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ChoicesView.1.1.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ChoicesView.this.I();
                            }
                        });
                    }

                    @Override // gb.j
                    public void Code(String str2, final Drawable drawable) {
                        if (drawable != null) {
                            gb.w.b(new Runnable() { // from class: com.huawei.hms.ads.ChoicesView.1.1.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ChoicesView.this.setImageDrawable(drawable);
                                }
                            });
                        }
                    }
                });
            }
        }

        public AnonymousClass1(String str) {
            this.Code = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceParam sourceParam = new SourceParam();
            sourceParam.l(false);
            sourceParam.h();
            sourceParam.e(com.huawei.openalliance.ad.constant.w.f22161i);
            sourceParam.i(this.Code);
            sourceParam.h();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("content", gb.b.p(sourceParam));
                ha.i.e(ChoicesView.this.getContext()).d(com.huawei.openalliance.ad.constant.s.L, jSONObject.toString(), new C02471(), String.class);
            } catch (JSONException unused) {
                ex.I("ChoicesView", "load ad choice icon jsonex");
            }
        }
    }

    public ChoicesView(Context context) {
        super(context, null);
        Code();
    }

    public void Code() {
        Resources resources = getContext().getResources();
        int i10 = R.dimen.hiad_24_dp;
        int dimensionPixelSize = resources.getDimensionPixelSize(i10);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i10);
        ex.Code("ChoicesView", "adChoiceViewWidth = %s", Integer.valueOf(dimensionPixelSize));
        setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
        setImageResource(R.drawable.hiad_hm_info);
    }

    public void I() {
        setImageResource(R.drawable.hiad_choices_adchoice);
    }

    public void V() {
        setImageResource(R.drawable.hiad_hm_close_btn);
    }

    public void setAdChoiceIcon(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ex.Code("ChoicesView", "updateIcon from server.");
        c0.d(new AnonymousClass1(str));
    }

    @GlobalApi
    public ChoicesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Code();
    }

    public void Code(int i10) {
        ex.Code("ChoicesView", "changeChoiceViewSize dp = %s", Integer.valueOf(i10));
        Resources resources = getContext().getResources();
        setLayoutParams(new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(i10), resources.getDimensionPixelSize(i10)));
    }

    @GlobalApi
    public ChoicesView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Code();
    }

    @GlobalApi
    public ChoicesView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        Code();
    }
}
