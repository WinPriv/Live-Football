package k2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import g2.b0;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f30308d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f30309a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30310b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, b0> f30311c;

    public b(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f30310b = str.concat("/");
        } else {
            this.f30310b = str;
        }
        this.f30311c = map;
        if (!(callback instanceof View)) {
            this.f30309a = null;
        } else {
            this.f30309a = ((View) callback).getContext().getApplicationContext();
        }
    }
}
