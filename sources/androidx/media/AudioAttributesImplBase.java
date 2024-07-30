package androidx.media;

import a3.l;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f2024a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2025b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2026c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2027d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2025b != audioAttributesImplBase.f2025b) {
            return false;
        }
        int i11 = this.f2026c;
        int i12 = audioAttributesImplBase.f2026c;
        int i13 = audioAttributesImplBase.f2027d;
        if (i13 != -1) {
            i10 = i13;
        } else {
            int i14 = audioAttributesImplBase.f2024a;
            int i15 = AudioAttributesCompat.f2020b;
            if ((i12 & 1) == 1) {
                i10 = 7;
            } else {
                i10 = 4;
                if ((i12 & 4) == 4) {
                    i10 = 6;
                } else {
                    switch (i14) {
                        case 2:
                            i10 = 0;
                            break;
                        case 3:
                            i10 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i10 = 5;
                            break;
                        case 6:
                            i10 = 2;
                            break;
                        case 11:
                            i10 = 10;
                            break;
                        case 12:
                        default:
                            i10 = 3;
                            break;
                        case 13:
                            i10 = 1;
                            break;
                    }
                }
            }
        }
        if (i10 == 6) {
            i12 |= 4;
        } else if (i10 == 7) {
            i12 |= 1;
        }
        if (i11 != (i12 & 273) || this.f2024a != audioAttributesImplBase.f2024a || this.f2027d != i13) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2025b), Integer.valueOf(this.f2026c), Integer.valueOf(this.f2024a), Integer.valueOf(this.f2027d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2027d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2027d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f2024a;
        int i11 = AudioAttributesCompat.f2020b;
        switch (i10) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = l.i("unknown usage ", i10);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f2025b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2026c).toUpperCase());
        return sb2.toString();
    }
}
