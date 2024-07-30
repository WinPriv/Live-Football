package com.applovin.exoplayer2.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.l.ai;
import com.vungle.warren.utility.platform.Platform;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f13372a = new e(new int[]{2}, 8);

    /* renamed from: b, reason: collision with root package name */
    private static final e f13373b = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f13374c = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: d, reason: collision with root package name */
    private final int[] f13375d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13376e;

    /* loaded from: classes.dex */
    public static final class a {
        public static int[] a() {
            boolean isDirectPlaybackSupported;
            s.a i10 = com.applovin.exoplayer2.common.a.s.i();
            for (int i11 : e.f13374c) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i11).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build());
                if (isDirectPlaybackSupported) {
                    i10.a(Integer.valueOf(i11));
                }
            }
            i10.a(2);
            return com.applovin.exoplayer2.common.b.c.a(i10.a());
        }
    }

    public e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f13375d = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f13375d = new int[0];
        }
        this.f13376e = i10;
    }

    public static e a(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    private static boolean c() {
        if (ai.f16274a >= 17) {
            String str = ai.f16276c;
            if (Platform.MANUFACTURER_AMAZON.equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Arrays.equals(this.f13375d, eVar.f13375d) && this.f13376e == eVar.f13376e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f13375d) * 31) + this.f13376e;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f13376e + ", supportedEncodings=" + Arrays.toString(this.f13375d) + "]";
    }

    @SuppressLint({"InlinedApi"})
    public static e a(Context context, Intent intent) {
        if (c() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f13373b;
        }
        if (ai.f16274a >= 29 && ai.c(context)) {
            return new e(a.a(), 8);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f13372a;
    }

    public boolean a(int i10) {
        return Arrays.binarySearch(this.f13375d, i10) >= 0;
    }

    public int a() {
        return this.f13376e;
    }
}
