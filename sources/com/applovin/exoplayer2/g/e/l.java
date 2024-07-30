package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() { // from class: com.applovin.exoplayer2.g.e.l.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15172a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15173b;

    public l(String str, String str2, String str3) {
        super(str);
        this.f15172a = str2;
        this.f15173b = str3;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0172a
    public void a(ac.a aVar) {
        String str = this.f;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    aVar.c(this.f15173b);
                    return;
                case 1:
                case 11:
                    aVar.i(this.f15173b);
                    return;
                case 2:
                case '\f':
                    aVar.e(Integer.valueOf(Integer.parseInt(this.f15173b.substring(2, 4)))).f(Integer.valueOf(Integer.parseInt(this.f15173b.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    aVar.b(this.f15173b);
                    return;
                case 4:
                case 18:
                    aVar.d(this.f15173b);
                    return;
                case 5:
                case 19:
                    aVar.j(this.f15173b);
                    return;
                case 6:
                case 20:
                    String[] a10 = ai.a(this.f15173b, "/");
                    aVar.a(Integer.valueOf(Integer.parseInt(a10[0]))).b(a10.length > 1 ? Integer.valueOf(Integer.parseInt(a10[1])) : null);
                    return;
                case 7:
                case 16:
                    aVar.a(this.f15173b);
                    return;
                case '\b':
                case 15:
                    aVar.h(this.f15173b);
                    return;
                case '\t':
                case 21:
                    aVar.d(Integer.valueOf(Integer.parseInt(this.f15173b)));
                    return;
                case '\r':
                    List<Integer> a11 = a(this.f15173b);
                    int size = a11.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                aVar.f(a11.get(2));
                            }
                        }
                        aVar.e(a11.get(1));
                    }
                    aVar.d(a11.get(0));
                    return;
                case 14:
                    List<Integer> a12 = a(this.f15173b);
                    int size2 = a12.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                aVar.i(a12.get(2));
                            }
                        }
                        aVar.h(a12.get(1));
                    }
                    aVar.g(a12.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (ai.a((Object) this.f, (Object) lVar.f) && ai.a((Object) this.f15172a, (Object) lVar.f15172a) && ai.a((Object) this.f15173b, (Object) lVar.f15173b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int b10 = e0.i.b(this.f, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f15172a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (b10 + i10) * 31;
        String str2 = this.f15173b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f + ": description=" + this.f15172a + ": value=" + this.f15173b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f);
        parcel.writeString(this.f15172a);
        parcel.writeString(this.f15173b);
    }

    public l(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f15172a = parcel.readString();
        this.f15173b = (String) ai.a(parcel.readString());
    }

    private static List<Integer> a(String str) {
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
}
