package h6;

import a3.k;
import android.animation.TypeEvaluator;
import com.anythink.expressad.exoplayer.k.p;

/* compiled from: ArgbEvaluatorCompat.java */
/* loaded from: classes2.dex */
public final class b implements TypeEvaluator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28773a = new b();

    public static Integer a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f10 = ((intValue >> 24) & p.f9095b) / 255.0f;
        float f11 = ((intValue >> 16) & p.f9095b) / 255.0f;
        float f12 = ((intValue >> 8) & p.f9095b) / 255.0f;
        int intValue2 = num2.intValue();
        float f13 = ((intValue2 >> 24) & p.f9095b) / 255.0f;
        float f14 = ((intValue2 >> 16) & p.f9095b) / 255.0f;
        float f15 = ((intValue2 >> 8) & p.f9095b) / 255.0f;
        float pow = (float) Math.pow(f11, 2.2d);
        float pow2 = (float) Math.pow(f12, 2.2d);
        float pow3 = (float) Math.pow((intValue & p.f9095b) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(f14, 2.2d);
        float pow5 = (float) Math.pow(f15, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & p.f9095b) / 255.0f, 2.2d);
        float d10 = k.d(f13, f10, f, f10);
        float d11 = k.d(pow4, pow, f, pow);
        float d12 = k.d(pow5, pow2, f, pow2);
        float d13 = k.d(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(d11, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(d12, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(d13, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(d10 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        return a(f, num, num2);
    }
}
