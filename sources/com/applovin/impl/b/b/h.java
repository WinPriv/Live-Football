package com.applovin.impl.b.b;

import android.app.Activity;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;

/* loaded from: classes.dex */
public class h extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f17355a;

    /* renamed from: b, reason: collision with root package name */
    private final p f17356b;

    public h(String str, Activity activity, p pVar) {
        super(str);
        this.f17355a = activity;
        this.f17356b = pVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        Utils.showWebViewActivity(Uri.parse(getURL()), this.f17355a, this.f17356b);
    }
}
