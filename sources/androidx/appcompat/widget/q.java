package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextView f1244s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Typeface f1245t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1246u;

    public q(TextView textView, Typeface typeface, int i10) {
        this.f1244s = textView;
        this.f1245t = typeface;
        this.f1246u = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1244s.setTypeface(this.f1245t, this.f1246u);
    }
}
