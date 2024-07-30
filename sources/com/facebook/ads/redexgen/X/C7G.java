package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7G extends ContextWrapper {
    public final C7I A00;
    public final AtomicReference<String> A01;

    public C7G(Context context, C7I c7i) {
        super(context.getApplicationContext());
        this.A01 = new AtomicReference<>();
        this.A00 = c7i;
    }

    public final C1315Wi A00() {
        return this.A00.A7K(this);
    }

    public final C7H A01() {
        return this.A00.A5o(this);
    }

    public final C7J A02() {
        return this.A00.A6T(this);
    }

    public final C7L A03() {
        return this.A00.A7J(this);
    }

    public final C7M A04() {
        return this.A00.A7b();
    }

    public final C7X A05() {
        return this.A00.A6J(this);
    }

    public final InterfaceC06967k A06() {
        return this.A00.A6K(this);
    }

    public final C8B A07() {
        return this.A00.A7R();
    }

    public final IT A08() {
        return this.A00.A5a(A00());
    }

    public final InterfaceC0958If A09() {
        return this.A00.A7L(A00());
    }

    @Nullable
    public final String A0A() {
        return this.A01.get();
    }

    public final void A0B(@Nullable String str) {
        this.A01.set(str);
    }
}
