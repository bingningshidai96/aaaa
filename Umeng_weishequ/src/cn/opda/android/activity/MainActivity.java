package cn.opda.android.activity;

import android.app.Activity;
import android.os.Bundle;

import com.umeng.comm.core.CommunitySDK;
import com.umeng.comm.core.impl.CommunityFactory;
import com.umeng.comm.login.sso.UMQQSsoHandler;
import com.umeng.comm.weixin.controller.UMWXHandler;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String appId = "100739898";
		String appKey = "0772e6f2df12f7690680b64423c941e5";
		new UMQQSsoHandler(this, appId, appKey).addToSocialSDK();
		
		String appid = "wx0fcc7840090084da";
		String appSecret = "090baa87c437589c28048c86b5c1503b";
		new UMWXHandler(this, appid, appSecret).addToSocialSDK();
		
		
		
		// 获取CommunitySDK实例, 参数1为Context类型
		CommunitySDK mCommSDK = CommunityFactory.getCommSDK(this);
		// 初始化sdk。建议传递getApplicationContext()
		mCommSDK.initSDK(this);
		// 打开微社区的接口, 参数1为Context类型
		mCommSDK.openCommunity(this);
		
	}

}
