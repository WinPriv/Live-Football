package k2;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import s2.c;

/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public final AssetManager f30306d;

    /* renamed from: a, reason: collision with root package name */
    public final j1.a f30303a = new j1.a(1, 0);

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f30304b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f30305c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public String f30307e = ".ttf";

    public a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f30306d = null;
        } else {
            this.f30306d = ((View) callback).getContext().getAssets();
        }
    }
}
