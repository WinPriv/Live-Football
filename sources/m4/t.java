package m4;

import com.anythink.core.common.b.g;
import m4.r;

/* compiled from: DefaultAudioTrackBufferSizeProvider.java */
/* loaded from: classes2.dex */
public final class t implements r.d {

    /* compiled from: DefaultAudioTrackBufferSizeProvider.java */
    /* loaded from: classes2.dex */
    public static class a {
    }

    public t(a aVar) {
    }

    public static int a(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return g.j.f5109p;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}
