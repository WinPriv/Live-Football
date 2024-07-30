package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import com.hamkho.livefoot.R;
import com.onesignal.a;

/* compiled from: PermissionsActivity.java */
/* loaded from: classes2.dex */
public final class c4 extends a.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f26712c;

    public c4(String str, String str2, Class cls) {
        this.f26710a = str;
        this.f26711b = str2;
        this.f26712c = cls;
    }

    @Override // com.onesignal.a.b
    public final void a(Activity activity) {
        if (!activity.getClass().equals(PermissionsActivity.class)) {
            Intent intent = new Intent(activity, (Class<?>) PermissionsActivity.class);
            intent.setFlags(131072);
            intent.putExtra("INTENT_EXTRA_PERMISSION_TYPE", this.f26710a).putExtra("INTENT_EXTRA_ANDROID_PERMISSION_STRING", this.f26711b).putExtra("INTENT_EXTRA_CALLBACK_CLASS", this.f26712c.getName());
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
        }
    }
}
