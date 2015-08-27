package com.buzzvil.buzzscreen.sample;

import android.app.Application;

import com.buzzvil.buzzscreen.sdk.BuzzScreen;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // app_key : SDK 사용을 위한 앱키로, 어드민에서 확인 가능
        // SimpleLockerActivity.class : 잠금화면 액티비티 클래스
        // R.drawable.image_on_fail : 네트워크 에러 혹은 일시적으로 잠금화면에 보여줄 캠페인이 없을 경우 보여주게 되는 이미지.
        // useMultiProcess : 잠금화면 서비스를 분리된 프로세스에서 실행하는 경우 true, 사용하지 않으면 false
        BuzzScreen.init("app_key", this, CustomLockerActivity.class, R.drawable.image_on_fail, false);

        // 정각 적립금 요청 트래픽을 분산하기 위한 팩터. 자세한 설명은 연동 가이드 참고.
//        BuzzScreen.setBasePointsSpreadingFactor(10);
    }
}
