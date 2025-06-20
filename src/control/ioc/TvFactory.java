package control.ioc;

import control.*;

public class TvFactory {
    // 싱글톤으로 만들어주세요.
    private static TvFactory tvFactory = null;
    public static TvFactory getInstance() {
        if (tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    private TvFactory() {}

    public Tv factory(String speakerName, String wooferName) {
        // 삼성 tv를 객체화 하려면? 스피커의 주소값 필요
        // 스피커를 객체화 하려면? 우퍼의 주소값 필요
        Woofer woofer = switch (wooferName) {
            case "marten" -> new MartenWoofer();
            case "genelec" -> new GenelecWoofer();
            default -> null;
        };

        Speaker speaker = switch (speakerName) {
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };

        return new SamsungTv(speaker);
    }
}
