package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import e0.i;
import j7.j0;
import j7.v1;
import java.util.ArrayList;
import k4.o0;

/* loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* renamed from: t, reason: collision with root package name */
    public final String f20059t;

    /* renamed from: u, reason: collision with root package name */
    public final j0<String> f20060u;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            String readString2 = parcel.readString();
            String[] createStringArray = parcel.createStringArray();
            createStringArray.getClass();
            return new TextInformationFrame(readString, readString2, j0.D(createStringArray));
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i10) {
            return new TextInformationFrame[i10];
        }
    }

    public TextInformationFrame(String str, String str2, v1 v1Var) {
        super(str);
        d6.a.a(!v1Var.isEmpty());
        this.f20059t = str2;
        j0<String> C = j0.C(v1Var);
        this.f20060u = C;
        C.get(0);
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (g0.a(this.f20048s, textInformationFrame.f20048s) && g0.a(this.f20059t, textInformationFrame.f20059t) && this.f20060u.equals(textInformationFrame.f20060u)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(o0.a aVar) {
        char c10;
        Integer num;
        String str = this.f20048s;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        j0<String> j0Var = this.f20060u;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    aVar.f30694c = j0Var.get(0);
                    return;
                case 1:
                case 11:
                    aVar.y = j0Var.get(0);
                    return;
                case 2:
                case '\f':
                    String str2 = j0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    aVar.f30708s = Integer.valueOf(parseInt);
                    aVar.f30709t = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 17:
                    aVar.f30693b = j0Var.get(0);
                    return;
                case 4:
                case 18:
                    aVar.f30695d = j0Var.get(0);
                    return;
                case 5:
                case 19:
                    aVar.f30714z = j0Var.get(0);
                    return;
                case 6:
                case 20:
                    String str3 = j0Var.get(0);
                    int i10 = g0.f27302a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    aVar.f30703m = Integer.valueOf(parseInt3);
                    aVar.f30704n = num;
                    return;
                case 7:
                case 16:
                    aVar.f30692a = j0Var.get(0);
                    return;
                case '\b':
                case 15:
                    aVar.f30713x = j0Var.get(0);
                    return;
                case '\t':
                case 21:
                    aVar.f30707r = Integer.valueOf(Integer.parseInt(j0Var.get(0)));
                    return;
                case '\r':
                    ArrayList a10 = a(j0Var.get(0));
                    int size = a10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.f30709t = (Integer) a10.get(2);
                            } else {
                                return;
                            }
                        }
                        aVar.f30708s = (Integer) a10.get(1);
                    }
                    aVar.f30707r = (Integer) a10.get(0);
                    return;
                case 14:
                    ArrayList a11 = a(j0Var.get(0));
                    int size2 = a11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.f30712w = (Integer) a11.get(2);
                            } else {
                                return;
                            }
                        }
                        aVar.f30711v = (Integer) a11.get(1);
                    }
                    aVar.f30710u = (Integer) a11.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final int hashCode() {
        int i10;
        int b10 = i.b(this.f20048s, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f20059t;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f20060u.hashCode() + ((b10 + i10) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f20048s + ": description=" + this.f20059t + ": values=" + this.f20060u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20048s);
        parcel.writeString(this.f20059t);
        parcel.writeStringArray((String[]) this.f20060u.toArray(new String[0]));
    }
}
