package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class Y5 implements C2J {
    public final SharedPreferences A00;

    public Y5(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final C2I A56() {
        return new Y6(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    public final long A6s(String str, long j10) {
        return this.A00.getLong(str, j10);
    }

    @Override // com.facebook.ads.redexgen.X.C2J
    @Nullable
    public final String A7a(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
