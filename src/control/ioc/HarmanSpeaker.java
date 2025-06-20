package control.ioc;

import control.Speaker;
import control.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    // HarmanSpeaker 가 객체화 된다면 GenelecWoofer를 사용할 수 있도록 해주세요.
    // HarmanSpeaker speaker = new HarmanSpeaker();

    public HarmanSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("HarmanSpeaker: 소리가 맑아요.");
        this.woofer.baseSound();
    }
}
