package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(o1.a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2022a = (AudioAttributes) aVar.l(audioAttributesImplApi26.f2022a, 1);
        audioAttributesImplApi26.f2023b = aVar.j(audioAttributesImplApi26.f2023b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, o1.a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f2022a;
        aVar.o(1);
        aVar.u(audioAttributes);
        aVar.t(audioAttributesImplApi26.f2023b, 2);
    }
}
