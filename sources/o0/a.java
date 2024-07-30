package o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: s, reason: collision with root package name */
    public final int f33516s;

    /* renamed from: t, reason: collision with root package name */
    public final g f33517t;

    /* renamed from: u, reason: collision with root package name */
    public final int f33518u;

    public a(int i10, g gVar, int i11) {
        this.f33516s = i10;
        this.f33517t = gVar;
        this.f33518u = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f33516s);
        this.f33517t.f33521a.performAction(this.f33518u, bundle);
    }
}
