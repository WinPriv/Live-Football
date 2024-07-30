package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(o1.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2024a = aVar.j(audioAttributesImplBase.f2024a, 1);
        audioAttributesImplBase.f2025b = aVar.j(audioAttributesImplBase.f2025b, 2);
        audioAttributesImplBase.f2026c = aVar.j(audioAttributesImplBase.f2026c, 3);
        audioAttributesImplBase.f2027d = aVar.j(audioAttributesImplBase.f2027d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, o1.a aVar) {
        aVar.getClass();
        aVar.t(audioAttributesImplBase.f2024a, 1);
        aVar.t(audioAttributesImplBase.f2025b, 2);
        aVar.t(audioAttributesImplBase.f2026c, 3);
        aVar.t(audioAttributesImplBase.f2027d, 4);
    }
}
