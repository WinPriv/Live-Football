package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(o1.a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2022a = (AudioAttributes) aVar.l(audioAttributesImplApi21.f2022a, 1);
        audioAttributesImplApi21.f2023b = aVar.j(audioAttributesImplApi21.f2023b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, o1.a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2022a;
        aVar.o(1);
        aVar.u(audioAttributes);
        aVar.t(audioAttributesImplApi21.f2023b, 2);
    }
}
