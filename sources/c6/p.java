package c6;

import android.content.Context;
import android.os.Handler;
import c6.e;
import d6.u;
import j7.j0;
import j7.m0;
import j7.v1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DefaultBandwidthMeter.java */
/* loaded from: classes2.dex */
public final class p implements e, h0 {

    /* renamed from: n, reason: collision with root package name */
    public static final v1 f3392n = j0.F(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final v1 o = j0.F(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* renamed from: p, reason: collision with root package name */
    public static final v1 f3393p = j0.F(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* renamed from: q, reason: collision with root package name */
    public static final v1 f3394q = j0.F(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* renamed from: r, reason: collision with root package name */
    public static final v1 f3395r = j0.F(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* renamed from: s, reason: collision with root package name */
    public static final v1 f3396s = j0.F(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    /* renamed from: t, reason: collision with root package name */
    public static p f3397t;

    /* renamed from: a, reason: collision with root package name */
    public final m0<Integer, Long> f3398a;

    /* renamed from: b, reason: collision with root package name */
    public final e.a.C0040a f3399b = new e.a.C0040a();

    /* renamed from: c, reason: collision with root package name */
    public final f0 f3400c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.c f3401d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3402e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public long f3403g;

    /* renamed from: h, reason: collision with root package name */
    public long f3404h;

    /* renamed from: i, reason: collision with root package name */
    public int f3405i;

    /* renamed from: j, reason: collision with root package name */
    public long f3406j;

    /* renamed from: k, reason: collision with root package name */
    public long f3407k;

    /* renamed from: l, reason: collision with root package name */
    public long f3408l;

    /* renamed from: m, reason: collision with root package name */
    public long f3409m;

    /* compiled from: DefaultBandwidthMeter.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3410a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f3411b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3412c;

        /* renamed from: d, reason: collision with root package name */
        public final d6.a0 f3413d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f3414e;

        /* JADX WARN: Removed duplicated region for block: B:100:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0267  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0283  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x02d7  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x02e5  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x02f3  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0301  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x030f  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x031d  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x032b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0339  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0347  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x0355  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0363  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x0371  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x037f  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x038d  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x039b  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x03a9  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x03b7  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x03c5  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x03d3  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x03e1  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x03ef  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x03fd  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x040b  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x0419  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x0427  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x0435  */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0443  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x0451  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x045f  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x046d  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x047b  */
        /* JADX WARN: Removed duplicated region for block: B:244:0x0489  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x0497  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x04a5  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x04b3  */
        /* JADX WARN: Removed duplicated region for block: B:256:0x04c1  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x04cf  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:262:0x04dd  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x04eb  */
        /* JADX WARN: Removed duplicated region for block: B:268:0x04f9  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x0507  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x0515  */
        /* JADX WARN: Removed duplicated region for block: B:277:0x0523  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x0531  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x053f  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x054d  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x055b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:292:0x0569  */
        /* JADX WARN: Removed duplicated region for block: B:295:0x0577  */
        /* JADX WARN: Removed duplicated region for block: B:298:0x0585  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x0593  */
        /* JADX WARN: Removed duplicated region for block: B:304:0x05a1  */
        /* JADX WARN: Removed duplicated region for block: B:307:0x05af  */
        /* JADX WARN: Removed duplicated region for block: B:310:0x05bd  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x05cb  */
        /* JADX WARN: Removed duplicated region for block: B:316:0x05d9  */
        /* JADX WARN: Removed duplicated region for block: B:319:0x05e7  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:322:0x05f5  */
        /* JADX WARN: Removed duplicated region for block: B:325:0x0603  */
        /* JADX WARN: Removed duplicated region for block: B:328:0x0611  */
        /* JADX WARN: Removed duplicated region for block: B:331:0x061f  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x062d  */
        /* JADX WARN: Removed duplicated region for block: B:337:0x063b  */
        /* JADX WARN: Removed duplicated region for block: B:340:0x0649  */
        /* JADX WARN: Removed duplicated region for block: B:343:0x0657  */
        /* JADX WARN: Removed duplicated region for block: B:346:0x0665  */
        /* JADX WARN: Removed duplicated region for block: B:349:0x0673  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:352:0x0681  */
        /* JADX WARN: Removed duplicated region for block: B:355:0x068f  */
        /* JADX WARN: Removed duplicated region for block: B:358:0x069d  */
        /* JADX WARN: Removed duplicated region for block: B:361:0x06ab  */
        /* JADX WARN: Removed duplicated region for block: B:364:0x06b9  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x06c7  */
        /* JADX WARN: Removed duplicated region for block: B:370:0x06d5  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x06e3  */
        /* JADX WARN: Removed duplicated region for block: B:376:0x06f1  */
        /* JADX WARN: Removed duplicated region for block: B:379:0x06ff  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x070d  */
        /* JADX WARN: Removed duplicated region for block: B:385:0x071b  */
        /* JADX WARN: Removed duplicated region for block: B:388:0x0729  */
        /* JADX WARN: Removed duplicated region for block: B:391:0x0737  */
        /* JADX WARN: Removed duplicated region for block: B:394:0x0745  */
        /* JADX WARN: Removed duplicated region for block: B:397:0x0753  */
        /* JADX WARN: Removed duplicated region for block: B:400:0x0761  */
        /* JADX WARN: Removed duplicated region for block: B:403:0x076f  */
        /* JADX WARN: Removed duplicated region for block: B:406:0x077d  */
        /* JADX WARN: Removed duplicated region for block: B:409:0x078b  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:412:0x0799  */
        /* JADX WARN: Removed duplicated region for block: B:415:0x07a7  */
        /* JADX WARN: Removed duplicated region for block: B:418:0x07b5  */
        /* JADX WARN: Removed duplicated region for block: B:421:0x07c3  */
        /* JADX WARN: Removed duplicated region for block: B:424:0x07d1  */
        /* JADX WARN: Removed duplicated region for block: B:427:0x07df  */
        /* JADX WARN: Removed duplicated region for block: B:430:0x07ed  */
        /* JADX WARN: Removed duplicated region for block: B:433:0x07fb  */
        /* JADX WARN: Removed duplicated region for block: B:436:0x0809  */
        /* JADX WARN: Removed duplicated region for block: B:439:0x0817  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:442:0x0825  */
        /* JADX WARN: Removed duplicated region for block: B:445:0x0833  */
        /* JADX WARN: Removed duplicated region for block: B:448:0x0841  */
        /* JADX WARN: Removed duplicated region for block: B:451:0x084f  */
        /* JADX WARN: Removed duplicated region for block: B:454:0x085d  */
        /* JADX WARN: Removed duplicated region for block: B:457:0x086b  */
        /* JADX WARN: Removed duplicated region for block: B:460:0x0879  */
        /* JADX WARN: Removed duplicated region for block: B:463:0x0887  */
        /* JADX WARN: Removed duplicated region for block: B:466:0x0895  */
        /* JADX WARN: Removed duplicated region for block: B:469:0x08a3  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:472:0x08b1  */
        /* JADX WARN: Removed duplicated region for block: B:475:0x08bf  */
        /* JADX WARN: Removed duplicated region for block: B:478:0x08cd  */
        /* JADX WARN: Removed duplicated region for block: B:481:0x08db  */
        /* JADX WARN: Removed duplicated region for block: B:484:0x08e9  */
        /* JADX WARN: Removed duplicated region for block: B:487:0x08f7  */
        /* JADX WARN: Removed duplicated region for block: B:490:0x0905  */
        /* JADX WARN: Removed duplicated region for block: B:493:0x0913  */
        /* JADX WARN: Removed duplicated region for block: B:496:0x0921  */
        /* JADX WARN: Removed duplicated region for block: B:499:0x092f  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:502:0x093d  */
        /* JADX WARN: Removed duplicated region for block: B:505:0x094b  */
        /* JADX WARN: Removed duplicated region for block: B:508:0x0959  */
        /* JADX WARN: Removed duplicated region for block: B:511:0x0967  */
        /* JADX WARN: Removed duplicated region for block: B:514:0x0975  */
        /* JADX WARN: Removed duplicated region for block: B:517:0x0983  */
        /* JADX WARN: Removed duplicated region for block: B:520:0x0991  */
        /* JADX WARN: Removed duplicated region for block: B:523:0x099f  */
        /* JADX WARN: Removed duplicated region for block: B:526:0x09ad  */
        /* JADX WARN: Removed duplicated region for block: B:529:0x09bb  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:532:0x09c9  */
        /* JADX WARN: Removed duplicated region for block: B:535:0x09d7  */
        /* JADX WARN: Removed duplicated region for block: B:538:0x09e5  */
        /* JADX WARN: Removed duplicated region for block: B:541:0x09f3  */
        /* JADX WARN: Removed duplicated region for block: B:544:0x0a01  */
        /* JADX WARN: Removed duplicated region for block: B:547:0x0a0f  */
        /* JADX WARN: Removed duplicated region for block: B:550:0x0a1d  */
        /* JADX WARN: Removed duplicated region for block: B:553:0x0a2b  */
        /* JADX WARN: Removed duplicated region for block: B:556:0x0a39  */
        /* JADX WARN: Removed duplicated region for block: B:559:0x0a47  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:562:0x0a55  */
        /* JADX WARN: Removed duplicated region for block: B:565:0x0a63  */
        /* JADX WARN: Removed duplicated region for block: B:568:0x0a71  */
        /* JADX WARN: Removed duplicated region for block: B:571:0x0a7f  */
        /* JADX WARN: Removed duplicated region for block: B:574:0x0a8d  */
        /* JADX WARN: Removed duplicated region for block: B:577:0x0a9b  */
        /* JADX WARN: Removed duplicated region for block: B:580:0x0aa9  */
        /* JADX WARN: Removed duplicated region for block: B:583:0x0ab7  */
        /* JADX WARN: Removed duplicated region for block: B:586:0x0ac5  */
        /* JADX WARN: Removed duplicated region for block: B:589:0x0ad3  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:592:0x0ae1  */
        /* JADX WARN: Removed duplicated region for block: B:595:0x0aef  */
        /* JADX WARN: Removed duplicated region for block: B:598:0x0afd  */
        /* JADX WARN: Removed duplicated region for block: B:601:0x0b0b  */
        /* JADX WARN: Removed duplicated region for block: B:604:0x0b19  */
        /* JADX WARN: Removed duplicated region for block: B:607:0x0b27  */
        /* JADX WARN: Removed duplicated region for block: B:610:0x0b35  */
        /* JADX WARN: Removed duplicated region for block: B:613:0x0b43  */
        /* JADX WARN: Removed duplicated region for block: B:616:0x0b51  */
        /* JADX WARN: Removed duplicated region for block: B:619:0x0b5f  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:622:0x0b6d  */
        /* JADX WARN: Removed duplicated region for block: B:625:0x0b7b  */
        /* JADX WARN: Removed duplicated region for block: B:628:0x0b89  */
        /* JADX WARN: Removed duplicated region for block: B:631:0x0b97  */
        /* JADX WARN: Removed duplicated region for block: B:634:0x0ba5  */
        /* JADX WARN: Removed duplicated region for block: B:637:0x0bb3  */
        /* JADX WARN: Removed duplicated region for block: B:640:0x0bc1  */
        /* JADX WARN: Removed duplicated region for block: B:643:0x0bcf  */
        /* JADX WARN: Removed duplicated region for block: B:646:0x0bdd  */
        /* JADX WARN: Removed duplicated region for block: B:649:0x0beb  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:652:0x0bf9  */
        /* JADX WARN: Removed duplicated region for block: B:655:0x0c07  */
        /* JADX WARN: Removed duplicated region for block: B:658:0x0c15  */
        /* JADX WARN: Removed duplicated region for block: B:661:0x0c23  */
        /* JADX WARN: Removed duplicated region for block: B:664:0x0c31  */
        /* JADX WARN: Removed duplicated region for block: B:667:0x0c3f  */
        /* JADX WARN: Removed duplicated region for block: B:670:0x0c4d  */
        /* JADX WARN: Removed duplicated region for block: B:673:0x0c5b  */
        /* JADX WARN: Removed duplicated region for block: B:676:0x0c69  */
        /* JADX WARN: Removed duplicated region for block: B:679:0x0c77  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:682:0x0c85  */
        /* JADX WARN: Removed duplicated region for block: B:685:0x0c93  */
        /* JADX WARN: Removed duplicated region for block: B:688:0x0ca1  */
        /* JADX WARN: Removed duplicated region for block: B:691:0x0caf  */
        /* JADX WARN: Removed duplicated region for block: B:694:0x0cbd  */
        /* JADX WARN: Removed duplicated region for block: B:697:0x0cca  */
        /* JADX WARN: Removed duplicated region for block: B:700:0x0cd7  */
        /* JADX WARN: Removed duplicated region for block: B:703:0x0ce4  */
        /* JADX WARN: Removed duplicated region for block: B:706:0x0cf0  */
        /* JADX WARN: Removed duplicated region for block: B:709:0x0cfb  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:712:0x0d06  */
        /* JADX WARN: Removed duplicated region for block: B:715:0x0d11  */
        /* JADX WARN: Removed duplicated region for block: B:718:0x0d1c  */
        /* JADX WARN: Removed duplicated region for block: B:721:0x0d27  */
        /* JADX WARN: Removed duplicated region for block: B:724:0x0d32  */
        /* JADX WARN: Removed duplicated region for block: B:728:0x0d3f  */
        /* JADX WARN: Removed duplicated region for block: B:732:0x0d46  */
        /* JADX WARN: Removed duplicated region for block: B:733:0x0d4d  */
        /* JADX WARN: Removed duplicated region for block: B:734:0x0d54  */
        /* JADX WARN: Removed duplicated region for block: B:735:0x0d5b  */
        /* JADX WARN: Removed duplicated region for block: B:736:0x0d62  */
        /* JADX WARN: Removed duplicated region for block: B:737:0x0d69  */
        /* JADX WARN: Removed duplicated region for block: B:738:0x0d70  */
        /* JADX WARN: Removed duplicated region for block: B:739:0x0d77  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:740:0x0d7e  */
        /* JADX WARN: Removed duplicated region for block: B:741:0x0d85  */
        /* JADX WARN: Removed duplicated region for block: B:742:0x0d8c  */
        /* JADX WARN: Removed duplicated region for block: B:743:0x0d93  */
        /* JADX WARN: Removed duplicated region for block: B:744:0x0d9a  */
        /* JADX WARN: Removed duplicated region for block: B:745:0x0da1  */
        /* JADX WARN: Removed duplicated region for block: B:746:0x0da8  */
        /* JADX WARN: Removed duplicated region for block: B:747:0x0daf  */
        /* JADX WARN: Removed duplicated region for block: B:748:0x0db6  */
        /* JADX WARN: Removed duplicated region for block: B:749:0x0dbd  */
        /* JADX WARN: Removed duplicated region for block: B:750:0x0dc4  */
        /* JADX WARN: Removed duplicated region for block: B:751:0x0dcb  */
        /* JADX WARN: Removed duplicated region for block: B:752:0x0dd2  */
        /* JADX WARN: Removed duplicated region for block: B:753:0x0dd9  */
        /* JADX WARN: Removed duplicated region for block: B:754:0x0de0  */
        /* JADX WARN: Removed duplicated region for block: B:755:0x0de7  */
        /* JADX WARN: Removed duplicated region for block: B:756:0x0dee  */
        /* JADX WARN: Removed duplicated region for block: B:757:0x0df5  */
        /* JADX WARN: Removed duplicated region for block: B:758:0x0dfc  */
        /* JADX WARN: Removed duplicated region for block: B:759:0x0e03  */
        /* JADX WARN: Removed duplicated region for block: B:760:0x0e0a  */
        /* JADX WARN: Removed duplicated region for block: B:761:0x0e11  */
        /* JADX WARN: Removed duplicated region for block: B:762:0x0e18  */
        /* JADX WARN: Removed duplicated region for block: B:763:0x0e1f  */
        /* JADX WARN: Removed duplicated region for block: B:764:0x0e26  */
        /* JADX WARN: Removed duplicated region for block: B:765:0x0e2d  */
        /* JADX WARN: Removed duplicated region for block: B:766:0x0e34  */
        /* JADX WARN: Removed duplicated region for block: B:767:0x0e3b  */
        /* JADX WARN: Removed duplicated region for block: B:768:0x0e42  */
        /* JADX WARN: Removed duplicated region for block: B:769:0x0e49  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:770:0x0e50  */
        /* JADX WARN: Removed duplicated region for block: B:771:0x0e57  */
        /* JADX WARN: Removed duplicated region for block: B:772:0x0e5e  */
        /* JADX WARN: Removed duplicated region for block: B:773:0x0e65  */
        /* JADX WARN: Removed duplicated region for block: B:774:0x0e6c  */
        /* JADX WARN: Removed duplicated region for block: B:775:0x0e73  */
        /* JADX WARN: Removed duplicated region for block: B:776:0x0e7a  */
        /* JADX WARN: Removed duplicated region for block: B:777:0x0e81  */
        /* JADX WARN: Removed duplicated region for block: B:778:0x0e88  */
        /* JADX WARN: Removed duplicated region for block: B:779:0x0e8f  */
        /* JADX WARN: Removed duplicated region for block: B:780:0x0e96  */
        /* JADX WARN: Removed duplicated region for block: B:781:0x0e9d  */
        /* JADX WARN: Removed duplicated region for block: B:782:0x0ea4  */
        /* JADX WARN: Removed duplicated region for block: B:783:0x0eab  */
        /* JADX WARN: Removed duplicated region for block: B:784:0x0eb2  */
        /* JADX WARN: Removed duplicated region for block: B:785:0x0eb9  */
        /* JADX WARN: Removed duplicated region for block: B:786:0x0ec0  */
        /* JADX WARN: Removed duplicated region for block: B:787:0x0ec7  */
        /* JADX WARN: Removed duplicated region for block: B:788:0x0ece  */
        /* JADX WARN: Removed duplicated region for block: B:789:0x0ed5  */
        /* JADX WARN: Removed duplicated region for block: B:790:0x0edc  */
        /* JADX WARN: Removed duplicated region for block: B:791:0x0ee3  */
        /* JADX WARN: Removed duplicated region for block: B:792:0x0eea  */
        /* JADX WARN: Removed duplicated region for block: B:793:0x0ef1  */
        /* JADX WARN: Removed duplicated region for block: B:794:0x0ef8  */
        /* JADX WARN: Removed duplicated region for block: B:795:0x0eff  */
        /* JADX WARN: Removed duplicated region for block: B:796:0x0f06  */
        /* JADX WARN: Removed duplicated region for block: B:797:0x0f0d  */
        /* JADX WARN: Removed duplicated region for block: B:798:0x0f14  */
        /* JADX WARN: Removed duplicated region for block: B:799:0x0f1b  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:800:0x0f22  */
        /* JADX WARN: Removed duplicated region for block: B:801:0x0f29  */
        /* JADX WARN: Removed duplicated region for block: B:802:0x0f30  */
        /* JADX WARN: Removed duplicated region for block: B:803:0x0f37  */
        /* JADX WARN: Removed duplicated region for block: B:804:0x0f3e  */
        /* JADX WARN: Removed duplicated region for block: B:805:0x0f45  */
        /* JADX WARN: Removed duplicated region for block: B:806:0x0f4c  */
        /* JADX WARN: Removed duplicated region for block: B:807:0x0f53  */
        /* JADX WARN: Removed duplicated region for block: B:808:0x0f5a  */
        /* JADX WARN: Removed duplicated region for block: B:809:0x0f61  */
        /* JADX WARN: Removed duplicated region for block: B:810:0x0f68  */
        /* JADX WARN: Removed duplicated region for block: B:811:0x0f6f  */
        /* JADX WARN: Removed duplicated region for block: B:812:0x0f76  */
        /* JADX WARN: Removed duplicated region for block: B:813:0x0f7d  */
        /* JADX WARN: Removed duplicated region for block: B:814:0x0f84  */
        /* JADX WARN: Removed duplicated region for block: B:815:0x0f8b  */
        /* JADX WARN: Removed duplicated region for block: B:816:0x0f92  */
        /* JADX WARN: Removed duplicated region for block: B:817:0x0f99  */
        /* JADX WARN: Removed duplicated region for block: B:818:0x0fa0  */
        /* JADX WARN: Removed duplicated region for block: B:819:0x0fa7  */
        /* JADX WARN: Removed duplicated region for block: B:820:0x0fae  */
        /* JADX WARN: Removed duplicated region for block: B:821:0x0fb5  */
        /* JADX WARN: Removed duplicated region for block: B:822:0x0fbc  */
        /* JADX WARN: Removed duplicated region for block: B:823:0x0fc3  */
        /* JADX WARN: Removed duplicated region for block: B:824:0x0fca  */
        /* JADX WARN: Removed duplicated region for block: B:825:0x0fd1  */
        /* JADX WARN: Removed duplicated region for block: B:826:0x0fd8  */
        /* JADX WARN: Removed duplicated region for block: B:827:0x0fdf  */
        /* JADX WARN: Removed duplicated region for block: B:828:0x0fe6  */
        /* JADX WARN: Removed duplicated region for block: B:829:0x0fed  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:830:0x0ff4  */
        /* JADX WARN: Removed duplicated region for block: B:831:0x0ffb  */
        /* JADX WARN: Removed duplicated region for block: B:832:0x1002  */
        /* JADX WARN: Removed duplicated region for block: B:833:0x1009  */
        /* JADX WARN: Removed duplicated region for block: B:834:0x1010  */
        /* JADX WARN: Removed duplicated region for block: B:835:0x1017  */
        /* JADX WARN: Removed duplicated region for block: B:836:0x101e  */
        /* JADX WARN: Removed duplicated region for block: B:837:0x1025  */
        /* JADX WARN: Removed duplicated region for block: B:838:0x102c  */
        /* JADX WARN: Removed duplicated region for block: B:839:0x1033  */
        /* JADX WARN: Removed duplicated region for block: B:840:0x103a  */
        /* JADX WARN: Removed duplicated region for block: B:841:0x1041  */
        /* JADX WARN: Removed duplicated region for block: B:842:0x1048  */
        /* JADX WARN: Removed duplicated region for block: B:843:0x104f  */
        /* JADX WARN: Removed duplicated region for block: B:844:0x1056  */
        /* JADX WARN: Removed duplicated region for block: B:845:0x105d  */
        /* JADX WARN: Removed duplicated region for block: B:846:0x1064  */
        /* JADX WARN: Removed duplicated region for block: B:847:0x106b  */
        /* JADX WARN: Removed duplicated region for block: B:848:0x1072  */
        /* JADX WARN: Removed duplicated region for block: B:849:0x1079  */
        /* JADX WARN: Removed duplicated region for block: B:850:0x1080  */
        /* JADX WARN: Removed duplicated region for block: B:851:0x1087  */
        /* JADX WARN: Removed duplicated region for block: B:852:0x108e  */
        /* JADX WARN: Removed duplicated region for block: B:853:0x1095  */
        /* JADX WARN: Removed duplicated region for block: B:854:0x109c  */
        /* JADX WARN: Removed duplicated region for block: B:855:0x10a3  */
        /* JADX WARN: Removed duplicated region for block: B:856:0x10aa  */
        /* JADX WARN: Removed duplicated region for block: B:857:0x10b1  */
        /* JADX WARN: Removed duplicated region for block: B:858:0x10b8  */
        /* JADX WARN: Removed duplicated region for block: B:859:0x10bf  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:860:0x10c6  */
        /* JADX WARN: Removed duplicated region for block: B:861:0x10cd  */
        /* JADX WARN: Removed duplicated region for block: B:862:0x10d4  */
        /* JADX WARN: Removed duplicated region for block: B:863:0x10db  */
        /* JADX WARN: Removed duplicated region for block: B:864:0x10e2  */
        /* JADX WARN: Removed duplicated region for block: B:865:0x10e9  */
        /* JADX WARN: Removed duplicated region for block: B:866:0x10f0  */
        /* JADX WARN: Removed duplicated region for block: B:867:0x10f7  */
        /* JADX WARN: Removed duplicated region for block: B:868:0x10fe  */
        /* JADX WARN: Removed duplicated region for block: B:869:0x1105  */
        /* JADX WARN: Removed duplicated region for block: B:870:0x110c  */
        /* JADX WARN: Removed duplicated region for block: B:871:0x1113  */
        /* JADX WARN: Removed duplicated region for block: B:872:0x111a  */
        /* JADX WARN: Removed duplicated region for block: B:873:0x1121  */
        /* JADX WARN: Removed duplicated region for block: B:874:0x1128  */
        /* JADX WARN: Removed duplicated region for block: B:875:0x112f  */
        /* JADX WARN: Removed duplicated region for block: B:876:0x1136  */
        /* JADX WARN: Removed duplicated region for block: B:877:0x113d  */
        /* JADX WARN: Removed duplicated region for block: B:878:0x1144  */
        /* JADX WARN: Removed duplicated region for block: B:879:0x114b  */
        /* JADX WARN: Removed duplicated region for block: B:880:0x1152  */
        /* JADX WARN: Removed duplicated region for block: B:881:0x1159  */
        /* JADX WARN: Removed duplicated region for block: B:882:0x1160  */
        /* JADX WARN: Removed duplicated region for block: B:883:0x1166  */
        /* JADX WARN: Removed duplicated region for block: B:884:0x116c  */
        /* JADX WARN: Removed duplicated region for block: B:885:0x1172  */
        /* JADX WARN: Removed duplicated region for block: B:886:0x1178  */
        /* JADX WARN: Removed duplicated region for block: B:887:0x117e  */
        /* JADX WARN: Removed duplicated region for block: B:888:0x1184  */
        /* JADX WARN: Removed duplicated region for block: B:889:0x118a  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:890:0x1190  */
        /* JADX WARN: Removed duplicated region for block: B:891:0x1196  */
        /* JADX WARN: Removed duplicated region for block: B:892:0x119c  */
        /* JADX WARN: Removed duplicated region for block: B:893:0x11a2  */
        /* JADX WARN: Removed duplicated region for block: B:894:0x11a8  */
        /* JADX WARN: Removed duplicated region for block: B:895:0x11ae  */
        /* JADX WARN: Removed duplicated region for block: B:896:0x11b4  */
        /* JADX WARN: Removed duplicated region for block: B:897:0x11ba  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01db  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.content.Context r15) {
            /*
                Method dump skipped, instructions count: 8798
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c6.p.a.<init>(android.content.Context):void");
        }
    }

    public p(Context context, HashMap hashMap, int i10, d6.a0 a0Var, boolean z10) {
        int i11;
        this.f3398a = m0.a(hashMap);
        this.f3400c = new f0(i10);
        this.f3401d = a0Var;
        this.f3402e = z10;
        if (context != null) {
            d6.u b10 = d6.u.b(context);
            synchronized (b10.f27375c) {
                i11 = b10.f27376d;
            }
            this.f3405i = i11;
            this.f3408l = i(i11);
            u.a aVar = new u.a() { // from class: c6.o
                @Override // d6.u.a
                public final void onNetworkTypeChanged(int i12) {
                    int i13;
                    p pVar = p.this;
                    synchronized (pVar) {
                        int i14 = pVar.f3405i;
                        if (i14 == 0 || pVar.f3402e) {
                            if (i14 != i12) {
                                pVar.f3405i = i12;
                                if (i12 != 1 && i12 != 0 && i12 != 8) {
                                    pVar.f3408l = pVar.i(i12);
                                    long elapsedRealtime = pVar.f3401d.elapsedRealtime();
                                    if (pVar.f > 0) {
                                        i13 = (int) (elapsedRealtime - pVar.f3403g);
                                    } else {
                                        i13 = 0;
                                    }
                                    pVar.j(i13, pVar.f3404h, pVar.f3408l);
                                    pVar.f3403g = elapsedRealtime;
                                    pVar.f3404h = 0L;
                                    pVar.f3407k = 0L;
                                    pVar.f3406j = 0L;
                                    f0 f0Var = pVar.f3400c;
                                    f0Var.f3341b.clear();
                                    f0Var.f3343d = -1;
                                    f0Var.f3344e = 0;
                                    f0Var.f = 0;
                                }
                            }
                        }
                    }
                }
            };
            CopyOnWriteArrayList<WeakReference<u.a>> copyOnWriteArrayList = b10.f27374b;
            Iterator<WeakReference<u.a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<u.a> next = it.next();
                if (next.get() == null) {
                    copyOnWriteArrayList.remove(next);
                }
            }
            copyOnWriteArrayList.add(new WeakReference<>(aVar));
            b10.f27373a.post(new com.applovin.exoplayer2.b.d0(7, b10, aVar));
            return;
        }
        this.f3405i = 0;
        this.f3408l = i(0);
    }

    @Override // c6.h0
    public final synchronized void a(m mVar, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            if ((mVar.f3384i & 8) == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = true;
            }
        }
        if (!z12) {
            return;
        }
        if (this.f == 0) {
            this.f3403g = this.f3401d.elapsedRealtime();
        }
        this.f++;
    }

    @Override // c6.e
    public final void c(Handler handler, l4.a aVar) {
        aVar.getClass();
        e.a.C0040a c0040a = this.f3399b;
        c0040a.getClass();
        c0040a.a(aVar);
        c0040a.f3324a.add(new e.a.C0040a.C0041a(handler, aVar));
    }

    @Override // c6.e
    public final void d(l4.a aVar) {
        this.f3399b.a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #0 {, blocks: (B:27:0x0005, B:9:0x0018, B:12:0x001d, B:14:0x003a, B:16:0x0053, B:18:0x0065, B:19:0x005c, B:20:0x0073), top: B:26:0x0005 }] */
    @Override // c6.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(c6.m r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L13
            int r10 = r10.f3384i     // Catch: java.lang.Throwable -> L7a
            r11 = 8
            r10 = r10 & r11
            if (r10 != r11) goto Le
            r10 = r0
            goto Lf
        Le:
            r10 = r1
        Lf:
            if (r10 != 0) goto L13
            r10 = r0
            goto L14
        L13:
            r10 = r1
        L14:
            if (r10 != 0) goto L18
            monitor-exit(r9)
            return
        L18:
            int r10 = r9.f     // Catch: java.lang.Throwable -> L7a
            if (r10 <= 0) goto L1d
            r1 = r0
        L1d:
            d6.a.d(r1)     // Catch: java.lang.Throwable -> L7a
            d6.c r10 = r9.f3401d     // Catch: java.lang.Throwable -> L7a
            long r10 = r10.elapsedRealtime()     // Catch: java.lang.Throwable -> L7a
            long r1 = r9.f3403g     // Catch: java.lang.Throwable -> L7a
            long r1 = r10 - r1
            int r4 = (int) r1     // Catch: java.lang.Throwable -> L7a
            long r1 = r9.f3406j     // Catch: java.lang.Throwable -> L7a
            long r5 = (long) r4     // Catch: java.lang.Throwable -> L7a
            long r1 = r1 + r5
            r9.f3406j = r1     // Catch: java.lang.Throwable -> L7a
            long r1 = r9.f3407k     // Catch: java.lang.Throwable -> L7a
            long r5 = r9.f3404h     // Catch: java.lang.Throwable -> L7a
            long r1 = r1 + r5
            r9.f3407k = r1     // Catch: java.lang.Throwable -> L7a
            if (r4 <= 0) goto L73
            float r1 = (float) r5     // Catch: java.lang.Throwable -> L7a
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r1 = r1 * r2
            float r2 = (float) r4     // Catch: java.lang.Throwable -> L7a
            float r1 = r1 / r2
            c6.f0 r2 = r9.f3400c     // Catch: java.lang.Throwable -> L7a
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L7a
            double r5 = java.lang.Math.sqrt(r5)     // Catch: java.lang.Throwable -> L7a
            int r3 = (int) r5     // Catch: java.lang.Throwable -> L7a
            r2.a(r1, r3)     // Catch: java.lang.Throwable -> L7a
            long r1 = r9.f3406j     // Catch: java.lang.Throwable -> L7a
            r5 = 2000(0x7d0, double:9.88E-321)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L5c
            long r1 = r9.f3407k     // Catch: java.lang.Throwable -> L7a
            r5 = 524288(0x80000, double:2.590327E-318)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L65
        L5c:
            c6.f0 r1 = r9.f3400c     // Catch: java.lang.Throwable -> L7a
            float r1 = r1.b()     // Catch: java.lang.Throwable -> L7a
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L7a
            r9.f3408l = r1     // Catch: java.lang.Throwable -> L7a
        L65:
            long r5 = r9.f3404h     // Catch: java.lang.Throwable -> L7a
            long r7 = r9.f3408l     // Catch: java.lang.Throwable -> L7a
            r3 = r9
            r3.j(r4, r5, r7)     // Catch: java.lang.Throwable -> L7a
            r9.f3403g = r10     // Catch: java.lang.Throwable -> L7a
            r10 = 0
            r9.f3404h = r10     // Catch: java.lang.Throwable -> L7a
        L73:
            int r10 = r9.f     // Catch: java.lang.Throwable -> L7a
            int r10 = r10 - r0
            r9.f = r10     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r9)
            return
        L7a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.p.f(c6.m, boolean):void");
    }

    @Override // c6.h0
    public final synchronized void g(m mVar, boolean z10, int i10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            if ((mVar.f3384i & 8) == 8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = true;
            }
        }
        if (!z12) {
            return;
        }
        this.f3404h += i10;
    }

    @Override // c6.e
    public final synchronized long h() {
        return this.f3408l;
    }

    public final long i(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        m0<Integer, Long> m0Var = this.f3398a;
        Long l10 = m0Var.get(valueOf);
        if (l10 == null) {
            l10 = m0Var.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void j(final int i10, final long j10, final long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f3409m) {
            return;
        }
        this.f3409m = j11;
        Iterator<e.a.C0040a.C0041a> it = this.f3399b.f3324a.iterator();
        while (it.hasNext()) {
            final e.a.C0040a.C0041a next = it.next();
            if (!next.f3327c) {
                next.f3325a.post(new Runnable() { // from class: c6.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.C0040a.C0041a.this.f3326b.G(i10, j10, j11);
                    }
                });
            }
        }
    }

    @Override // c6.h0
    public final void b() {
    }

    @Override // c6.e
    public final p e() {
        return this;
    }
}
