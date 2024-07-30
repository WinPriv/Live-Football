package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(o1.a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        o1.c cVar = audioAttributesCompat.f2021a;
        if (aVar.h(1)) {
            cVar = aVar.n();
        }
        audioAttributesCompat.f2021a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, o1.a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2021a;
        aVar.o(1);
        aVar.w(audioAttributesImpl);
    }
}
