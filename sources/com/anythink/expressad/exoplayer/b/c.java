package com.anythink.expressad.exoplayer.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7343a = new c(new int[]{2}, 2);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f7344b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7345c;

    private c(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f7344b = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f7344b = new int[0];
        }
        this.f7345c = i10;
    }

    public static c a(Context context) {
        return a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Arrays.equals(this.f7344b, cVar.f7344b) && this.f7345c == cVar.f7345c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f7344b) * 31) + this.f7345c;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f7345c + ", supportedEncodings=" + Arrays.toString(this.f7344b) + "]";
    }

    @SuppressLint({"InlinedApi"})
    public static c a(Intent intent) {
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new c(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
        }
        return f7343a;
    }

    public final boolean a(int i10) {
        return Arrays.binarySearch(this.f7344b, i10) >= 0;
    }

    private int a() {
        return this.f7345c;
    }
}
